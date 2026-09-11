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
public final class ky extends kl0 {
    public boolean E;
    public final kz F;
    public final fy f27914c;
    public long d;
    public TLRPC.StickerSet f27915e;
    public ArrayList f27916f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f27917n = new ArrayList();
    public final ArrayList f27918r = new ArrayList();
    public final ArrayList f27919s = new ArrayList();
    public String v;
    public String f27920w;
    public jy f27921x;
    public boolean f27922y;

    public ky(kz kzVar, Context context) {
        this.F = kzVar;
        ?? aVar = new oh.a(context, kzVar.f27932c1, new d(this, 11), new kv(this, 1), kzVar.Z1);
        this.f27914c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.Y2.f31135r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(ky kyVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        String str;
        kz kzVar = kyVar.F;
        String[] strArr = kzVar.W0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = kyVar.v;
        if (str3 == null) {
            return;
        }
        MediaDataController.getInstance(kzVar.f27932c1).searchStickers(true, str2, str3, new bi.r3((Object) kyVar, str3, arrayList, (Object) runnable, 8), z10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45742f;
        if (i10 != 0 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        kz kzVar = this.F;
        kx kxVar = kzVar.P;
        long j3 = 0;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            s4.h0 adapter = kxVar.getAdapter();
            tx txVar = kzVar.R;
            if (adapter != txVar) {
                kxVar.setAdapter(txVar);
                this.f27922y = false;
            }
            this.d = 0L;
            kzVar.f27926b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        jy jyVar = this.f27921x;
        if (jyVar != null) {
            AndroidUtilities.cancelRunOnUIThread(jyVar);
        }
        if (!TextUtils.isEmpty(this.v)) {
            this.f27917n.clear();
            this.E = false;
            kzVar.V.e(true);
            jy jyVar2 = new jy(this);
            this.f27921x = jyVar2;
            if (z10) {
                j3 = 300;
            }
            AndroidUtilities.runOnUIThread(jyVar2, j3);
        }
    }

    @Override
    public final int h() {
        if (this.d != 0) {
            return this.f27916f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f27919s;
        ArrayList arrayList3 = this.f27918r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.f27922y) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ky.j(int):int");
    }

    @Override
    public final void l() {
        this.f27914c.Y2.N(false);
        super.l();
    }

    @Override
    public final void v(s4.c1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ky.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ah.y yVar;
        kz kzVar = this.F;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            ah.y yVar2 = new ah.y(this, kzVar.getContext(), 14);
                            TextView textView = new TextView(kzVar.getContext());
                            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
                            textView.setTextSize(1, 16.0f);
                            int i11 = org.telegram.ui.ActionBar.j6.Le;
                            textView.setTextColor(kzVar.A(i11));
                            yVar2.addView(textView, w7.x5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(kzVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.msg_emoji_question);
                            imageView.setColorFilter(new PorterDuffColorFilter(kzVar.A(i11), PorterDuff.Mode.MULTIPLY));
                            yVar2.addView(imageView, w7.x5.e(48, 48, 85));
                            imageView.setOnClickListener(new hy(this));
                            yVar2.setLayoutParams(new s4.p0(-1, -2));
                            yVar = yVar2;
                        } else {
                            View view = new View(kzVar.getContext());
                            view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(68.0f)));
                            yVar = view;
                        }
                    } else {
                        ViewGroup.LayoutParams p0Var = new s4.p0(-1, AndroidUtilities.dp(79.0f));
                        View view2 = this.f27914c;
                        view2.setLayoutParams(p0Var);
                        yVar = view2;
                    }
                } else {
                    yVar = new org.telegram.ui.Cells.o8(kzVar.getContext(), true, false, kzVar.Z1, kzVar.f27953i2);
                }
            } else {
                View view3 = new View(kzVar.getContext());
                view3.setLayoutParams(new s4.p0(-1, kzVar.f27928b1));
                yVar = view3;
            }
        } else {
            yVar = new ty(kzVar.getContext());
        }
        return new s4.c1(yVar);
    }
}
