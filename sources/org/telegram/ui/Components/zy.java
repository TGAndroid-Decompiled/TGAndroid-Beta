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
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class zy extends pm0 {
    public boolean E;
    public final a00 F;
    public final uy f33674c;
    public long d;
    public TLRPC.StickerSet f33675e;
    public ArrayList f33676f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f33677n = new ArrayList();
    public final ArrayList f33678r = new ArrayList();
    public final ArrayList f33679s = new ArrayList();
    public String v;
    public String f33680w;
    public yy f33681x;
    public boolean f33682y;

    public zy(a00 a00Var, Context context) {
        this.F = a00Var;
        ?? aVar = new nh.a(context, a00Var.f24401c1, new d(this, 11), new bw(this, 1), a00Var.Z1);
        this.f33674c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.W2.f25280r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(zy zyVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        String str;
        a00 a00Var = zyVar.F;
        String[] strArr = a00Var.W0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = zyVar.v;
        if (str3 == null) {
            return;
        }
        MediaDataController.getInstance(a00Var.f24401c1).searchStickers(true, str2, str3, new ai.f4((Object) zyVar, str3, arrayList, (Object) runnable, 9), z10);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47660f;
        if (i10 != 0 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        a00 a00Var = this.F;
        my myVar = a00Var.P;
        long j3 = 0;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            s4.i0 adapter = myVar.getAdapter();
            jy jyVar = a00Var.R;
            if (adapter != jyVar) {
                myVar.setAdapter(jyVar);
                this.f33682y = false;
            }
            this.d = 0L;
            a00Var.f24395b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        yy yyVar = this.f33681x;
        if (yyVar != null) {
            AndroidUtilities.cancelRunOnUIThread(yyVar);
        }
        if (!TextUtils.isEmpty(this.v)) {
            this.f33677n.clear();
            this.E = false;
            a00Var.V.e(true);
            yy yyVar2 = new yy(this);
            this.f33681x = yyVar2;
            if (z10) {
                j3 = 300;
            }
            AndroidUtilities.runOnUIThread(yyVar2, j3);
        }
    }

    @Override
    public final int h() {
        if (this.d != 0) {
            return this.f33676f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f33679s;
        ArrayList arrayList3 = this.f33678r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.f33682y) {
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
    public final int j(int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zy.j(int):int");
    }

    @Override
    public final void l() {
        this.f33674c.W2.N(false);
        super.l();
    }

    @Override
    public final void v(s4.d1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zy.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        ai.f0 f0Var;
        a00 a00Var = this.F;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            ai.f0 f0Var2 = new ai.f0(this, a00Var.getContext(), 13);
                            TextView textView = new TextView(a00Var.getContext());
                            org.telegram.messenger.bi.j(16.0f, R.string.NoEmojiFound, 1, textView);
                            int i11 = org.telegram.ui.ActionBar.i6.Le;
                            textView.setTextColor(a00Var.B(i11));
                            f0Var2.addView(textView, w7.x5.a(-2.0f, 0.0f, 10.0f, 0.0f, 0.0f, -2, 49));
                            ImageView imageView = new ImageView(a00Var.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.msg_emoji_question);
                            imageView.setColorFilter(new PorterDuffColorFilter(a00Var.B(i11), PorterDuff.Mode.MULTIPLY));
                            f0Var2.addView(imageView, w7.x5.e(48, 48, 85));
                            imageView.setOnClickListener(new wy(this));
                            f0Var2.setLayoutParams(new s4.q0(-1, -2));
                            f0Var = f0Var2;
                        } else {
                            View view = new View(a00Var.getContext());
                            view.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(68.0f)));
                            f0Var = view;
                        }
                    } else {
                        ViewGroup.LayoutParams q0Var = new s4.q0(-1, AndroidUtilities.dp(79.0f));
                        View view2 = this.f33674c;
                        view2.setLayoutParams(q0Var);
                        f0Var = view2;
                    }
                } else {
                    f0Var = new org.telegram.ui.Cells.o8(a00Var.getContext(), true, false, a00Var.Z1, a00Var.f24422i2);
                }
            } else {
                View view3 = new View(a00Var.getContext());
                view3.setLayoutParams(new s4.q0(-1, a00Var.f24397b1));
                f0Var = view3;
            }
        } else {
            f0Var = new iz(a00Var.getContext());
        }
        return new s4.d1(f0Var);
    }
}
