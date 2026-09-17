package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jy extends ll0 {
    public boolean E;
    public final kz F;
    public final ey f25458c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f25459f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f25460n = new ArrayList();
    public final ArrayList f25461r = new ArrayList();
    public final ArrayList f25462s = new ArrayList();
    public String v;
    public String f25463w;
    public iy f25464x;
    public boolean f25465y;

    public jy(kz kzVar, Context context) {
        this.F = kzVar;
        ?? aVar = new nh.a(context, kzVar.f25713c1, new d(this, 11), new lv(this, 1), kzVar.Z1);
        this.f25458c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.Y2.f29851r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(jy jyVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        String str;
        kz kzVar = jyVar.F;
        String[] strArr = kzVar.W0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = jyVar.v;
        if (str3 == null) {
            return;
        }
        MediaDataController.getInstance(kzVar.f25713c1).searchStickers(true, str2, str3, new ai.e4((Object) jyVar, str3, arrayList, (Object) runnable, 8), z10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42700f;
        if (i10 != 0 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        kz kzVar = this.F;
        vx vxVar = kzVar.P;
        long j3 = 0;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            s4.h0 adapter = vxVar.getAdapter();
            sx sxVar = kzVar.R;
            if (adapter != sxVar) {
                vxVar.setAdapter(sxVar);
                this.f25465y = false;
            }
            this.d = 0L;
            kzVar.f25707b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        iy iyVar = this.f25464x;
        if (iyVar != null) {
            AndroidUtilities.cancelRunOnUIThread(iyVar);
        }
        if (!TextUtils.isEmpty(this.v)) {
            this.f25460n.clear();
            this.E = false;
            kzVar.V.e(true);
            iy iyVar2 = new iy(this);
            this.f25464x = iyVar2;
            if (z10) {
                j3 = 300;
            }
            AndroidUtilities.runOnUIThread(iyVar2, j3);
        }
    }

    @Override
    public final int h() {
        if (this.d != 0) {
            return this.f25459f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f25462s;
        ArrayList arrayList3 = this.f25461r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.f25465y) {
            return this.F.getRecentEmoji().size() + 1;
        }
        int i10 = 2;
        if (arrayList.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
            return 2;
        }
        if (!arrayList2.isEmpty()) {
            i10 = 3;
        } else if (arrayList.isEmpty()) {
            i10 = 1;
        }
        int size = arrayList.size() + i10;
        if (!arrayList3.isEmpty()) {
            return arrayList3.size() + size + 1;
        }
        return size;
    }

    @Override
    public final int j(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jy.j(int):int");
    }

    @Override
    public final void l() {
        this.f25458c.Y2.N(false);
        super.l();
    }

    @Override
    public final void v(s4.c1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jy.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ai.f0 f0Var;
        kz kzVar = this.F;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            ai.f0 f0Var2 = new ai.f0(this, kzVar.getContext(), 13);
                            TextView textView = new TextView(kzVar.getContext());
                            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
                            textView.setTextSize(1, 16.0f);
                            int i11 = org.telegram.ui.ActionBar.j6.Le;
                            textView.setTextColor(kzVar.z(i11));
                            f0Var2.addView(textView, w7.x5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(kzVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.msg_emoji_question);
                            imageView.setColorFilter(new PorterDuffColorFilter(kzVar.z(i11), PorterDuff.Mode.MULTIPLY));
                            f0Var2.addView(imageView, w7.x5.e(48, 48, 85));
                            imageView.setOnClickListener(new gy(this));
                            f0Var2.setLayoutParams(new s4.p0(-1, -2));
                            f0Var = f0Var2;
                        } else {
                            View view = new View(kzVar.getContext());
                            view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(68.0f)));
                            f0Var = view;
                        }
                    } else {
                        ViewGroup.LayoutParams p0Var = new s4.p0(-1, AndroidUtilities.dp(79.0f));
                        View view2 = this.f25458c;
                        view2.setLayoutParams(p0Var);
                        f0Var = view2;
                    }
                } else {
                    f0Var = new org.telegram.ui.Cells.o8(kzVar.getContext(), true, false, kzVar.Z1, kzVar.f25733i2);
                }
            } else {
                View view3 = new View(kzVar.getContext());
                view3.setLayoutParams(new s4.p0(-1, kzVar.f25709b1));
                f0Var = view3;
            }
        } else {
            f0Var = new ty(kzVar.getContext());
        }
        return new s4.c1(f0Var);
    }
}
