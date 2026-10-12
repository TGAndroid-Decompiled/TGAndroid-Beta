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
public final class cz extends vm0 {
    public boolean E;
    public final d00 F;
    public final xy f25051c;
    public long d;
    public TLRPC.StickerSet f25052e;
    public ArrayList f25053f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f25054n = new ArrayList();
    public final ArrayList f25055r = new ArrayList();
    public final ArrayList f25056s = new ArrayList();
    public String v;
    public String f25057w;
    public bz f25058x;
    public boolean f25059y;

    public cz(d00 d00Var, Context context) {
        this.F = d00Var;
        ?? aVar = new nh.a(context, d00Var.f25080c1, new d(this, 11), new ew(this, 1), d00Var.Z1);
        this.f25051c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.W2.f26675r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.d2(this, 1));
    }

    public static void E(cz czVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        String str;
        d00 d00Var = czVar.F;
        String[] strArr = d00Var.W0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = czVar.v;
        if (str3 == null) {
            return;
        }
        MediaDataController.getInstance(d00Var.f25080c1).searchStickers(true, str2, str3, new ai.f4((Object) czVar, str3, arrayList, (Object) runnable, 9), z10);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47893f;
        if (i10 != 0 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        d00 d00Var = this.F;
        py pyVar = d00Var.P;
        long j3 = 0;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            s4.i0 adapter = pyVar.getAdapter();
            my myVar = d00Var.R;
            if (adapter != myVar) {
                pyVar.setAdapter(myVar);
                this.f25059y = false;
            }
            this.d = 0L;
            d00Var.f25074b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        bz bzVar = this.f25058x;
        if (bzVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bzVar);
        }
        if (!TextUtils.isEmpty(this.v)) {
            this.f25054n.clear();
            this.E = false;
            d00Var.V.e(true);
            bz bzVar2 = new bz(this);
            this.f25058x = bzVar2;
            if (z10) {
                j3 = 300;
            }
            AndroidUtilities.runOnUIThread(bzVar2, j3);
        }
    }

    @Override
    public final int h() {
        if (this.d != 0) {
            return this.f25053f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f25056s;
        ArrayList arrayList3 = this.f25055r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.f25059y) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cz.j(int):int");
    }

    @Override
    public final void l() {
        this.f25051c.W2.N(false);
        super.l();
    }

    @Override
    public final void v(s4.d1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cz.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        ai.f0 f0Var;
        d00 d00Var = this.F;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            ai.f0 f0Var2 = new ai.f0(this, d00Var.getContext(), 13);
                            TextView textView = new TextView(d00Var.getContext());
                            org.telegram.messenger.am.j(16.0f, R.string.NoEmojiFound, 1, textView);
                            int i11 = org.telegram.ui.ActionBar.h6.Le;
                            textView.setTextColor(d00Var.A(i11));
                            f0Var2.addView(textView, w7.w5.a(-2.0f, 0.0f, 10.0f, 0.0f, 0.0f, -2, 49));
                            ImageView imageView = new ImageView(d00Var.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.msg_emoji_question);
                            imageView.setColorFilter(new PorterDuffColorFilter(d00Var.A(i11), PorterDuff.Mode.MULTIPLY));
                            f0Var2.addView(imageView, w7.w5.e(48, 48, 85));
                            imageView.setOnClickListener(new zy(this));
                            f0Var2.setLayoutParams(new s4.q0(-1, -2));
                            f0Var = f0Var2;
                        } else {
                            View view = new View(d00Var.getContext());
                            view.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(68.0f)));
                            f0Var = view;
                        }
                    } else {
                        ViewGroup.LayoutParams q0Var = new s4.q0(-1, AndroidUtilities.dp(79.0f));
                        View view2 = this.f25051c;
                        view2.setLayoutParams(q0Var);
                        f0Var = view2;
                    }
                } else {
                    f0Var = new org.telegram.ui.Cells.o8(d00Var.getContext(), true, false, d00Var.Z1, d00Var.f25101i2);
                }
            } else {
                View view3 = new View(d00Var.getContext());
                view3.setLayoutParams(new s4.q0(-1, d00Var.f25076b1));
                f0Var = view3;
            }
        } else {
            f0Var = new lz(d00Var.getContext());
        }
        return new s4.d1(f0Var);
    }
}
