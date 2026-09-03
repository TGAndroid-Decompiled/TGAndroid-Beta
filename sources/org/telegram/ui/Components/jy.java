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
public final class jy extends ql0 {
    public boolean B;
    public final kz C;
    public final dy f26069c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f26070f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f26071n = new ArrayList();
    public final ArrayList f26072r = new ArrayList();
    public final ArrayList f26073s = new ArrayList();
    public String v;
    public String f26074w;
    public iy f26075x;
    public boolean f26076y;

    public jy(kz kzVar, Context context) {
        this.C = kzVar;
        ?? cVar = new ah.c(context, kzVar.Z0, new d(this, 11), new ev(this, 1), kzVar.W1);
        this.f26069c = cVar;
        cVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        cVar.setClipToPadding(false);
        cVar.V2.f30148r = false;
        cVar.setNestedScrollingEnabled(false);
        cVar.setDrawSelection(false);
        cVar.setOnTouchListener(new m.d2(this, 1));
    }

    public static void E(jy jyVar, Runnable runnable, ArrayList arrayList, boolean z4) {
        String str;
        kz kzVar = jyVar.C;
        String[] strArr = kzVar.T0;
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
        MediaDataController.getInstance(kzVar.Z0).searchStickers(true, str2, str3, new gg.c1((Object) jyVar, str3, arrayList, (Object) runnable, 10), z4);
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 != 0 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z4) {
        kz kzVar = this.C;
        ix ixVar = kzVar.M;
        long j10 = 0;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            f2.o0 adapter = ixVar.getAdapter();
            rx rxVar = kzVar.O;
            if (adapter != rxVar) {
                ixVar.setAdapter(rxVar);
                this.f26076y = false;
            }
            this.d = 0L;
            kzVar.f26424b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        iy iyVar = this.f26075x;
        if (iyVar != null) {
            AndroidUtilities.cancelRunOnUIThread(iyVar);
        }
        if (!TextUtils.isEmpty(this.v)) {
            this.f26071n.clear();
            this.B = false;
            kzVar.S.e(true);
            iy iyVar2 = new iy(this);
            this.f26075x = iyVar2;
            if (z4) {
                j10 = 300;
            }
            AndroidUtilities.runOnUIThread(iyVar2, j10);
        }
    }

    @Override
    public final int h() {
        if (this.d != 0) {
            return this.f26070f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f26073s;
        ArrayList arrayList3 = this.f26072r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.f26076y) {
            return this.C.getRecentEmoji().size() + 1;
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
        this.f26069c.V2.N(false);
        super.l();
    }

    @Override
    public final void v(f2.l1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jy.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        dg.u2 u2Var;
        kz kzVar = this.C;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            dg.u2 u2Var2 = new dg.u2(this, kzVar.getContext(), 19);
                            TextView textView = new TextView(kzVar.getContext());
                            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
                            textView.setTextSize(1, 16.0f);
                            int i11 = org.telegram.ui.ActionBar.j6.Le;
                            textView.setTextColor(kzVar.A(i11));
                            u2Var2.addView(textView, k7.b6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(kzVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.msg_emoji_question);
                            imageView.setColorFilter(new PorterDuffColorFilter(kzVar.A(i11), PorterDuff.Mode.MULTIPLY));
                            u2Var2.addView(imageView, k7.b6.e(48, 48, 85));
                            imageView.setOnClickListener(new gy(this));
                            u2Var2.setLayoutParams(new f2.w0(-1, -2));
                            u2Var = u2Var2;
                        } else {
                            View view = new View(kzVar.getContext());
                            view.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(68.0f)));
                            u2Var = view;
                        }
                    } else {
                        ViewGroup.LayoutParams w0Var = new f2.w0(-1, AndroidUtilities.dp(79.0f));
                        View view2 = this.f26069c;
                        view2.setLayoutParams(w0Var);
                        u2Var = view2;
                    }
                } else {
                    u2Var = new org.telegram.ui.Cells.l8(kzVar.getContext(), true, false, kzVar.W1, kzVar.f26441f2);
                }
            } else {
                View view3 = new View(kzVar.getContext());
                view3.setLayoutParams(new f2.w0(-1, kzVar.Y0));
                u2Var = view3;
            }
        } else {
            u2Var = new sy(kzVar.getContext());
        }
        return new f2.l1(u2Var);
    }
}
