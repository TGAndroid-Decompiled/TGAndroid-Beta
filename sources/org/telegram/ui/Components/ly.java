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
public final class ly extends rl0 {
    public boolean B;
    public final mz C;
    public final fy f28894c;
    public long d;
    public TLRPC.StickerSet f28895e;
    public ArrayList f28896f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f28897n = new ArrayList();
    public final ArrayList f28898r = new ArrayList();
    public final ArrayList f28899s = new ArrayList();
    public String v;
    public String f28900w;
    public ky f28901x;
    public boolean f28902y;

    public ly(mz mzVar, Context context) {
        this.C = mzVar;
        ?? bVar = new bh.b(context, mzVar.Z0, new d(this, 11), new hv(this, 1), mzVar.W1);
        this.f28894c = bVar;
        bVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        bVar.setClipToPadding(false);
        bVar.V2.f32651r = false;
        bVar.setNestedScrollingEnabled(false);
        bVar.setDrawSelection(false);
        bVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(ly lyVar, Runnable runnable, ArrayList arrayList, boolean z4) {
        String str;
        mz mzVar = lyVar.C;
        String[] strArr = mzVar.T0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = lyVar.v;
        if (str3 == null) {
            return;
        }
        MediaDataController.getInstance(mzVar.Z0).searchStickers(true, str2, str3, new hg.c1(10, lyVar, arrayList, runnable, str3), z4);
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 0 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z4) {
        mz mzVar = this.C;
        kx kxVar = mzVar.M;
        long j10 = 0;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            f2.p0 adapter = kxVar.getAdapter();
            tx txVar = mzVar.O;
            if (adapter != txVar) {
                kxVar.setAdapter(txVar);
                this.f28902y = false;
            }
            this.d = 0L;
            mzVar.f29268b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        ky kyVar = this.f28901x;
        if (kyVar != null) {
            AndroidUtilities.cancelRunOnUIThread(kyVar);
        }
        if (!TextUtils.isEmpty(this.v)) {
            this.f28897n.clear();
            this.B = false;
            mzVar.S.e(true);
            ky kyVar2 = new ky(this);
            this.f28901x = kyVar2;
            if (z4) {
                j10 = 300;
            }
            AndroidUtilities.runOnUIThread(kyVar2, j10);
        }
    }

    @Override
    public final int h() {
        if (this.d != 0) {
            return this.f28896f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f28899s;
        ArrayList arrayList3 = this.f28898r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.f28902y) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ly.j(int):int");
    }

    @Override
    public final void l() {
        this.f28894c.V2.N(false);
        super.l();
    }

    @Override
    public final void v(f2.m1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ly.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        eg.s2 s2Var;
        mz mzVar = this.C;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            eg.s2 s2Var2 = new eg.s2(this, mzVar.getContext(), 19);
                            TextView textView = new TextView(mzVar.getContext());
                            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
                            textView.setTextSize(1, 16.0f);
                            int i11 = org.telegram.ui.ActionBar.k6.Le;
                            textView.setTextColor(mzVar.A(i11));
                            s2Var2.addView(textView, k7.c6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(mzVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.msg_emoji_question);
                            imageView.setColorFilter(new PorterDuffColorFilter(mzVar.A(i11), PorterDuff.Mode.MULTIPLY));
                            s2Var2.addView(imageView, k7.c6.e(48, 48, 85));
                            imageView.setOnClickListener(new iy(this));
                            s2Var2.setLayoutParams(new f2.x0(-1, -2));
                            s2Var = s2Var2;
                        } else {
                            View view = new View(mzVar.getContext());
                            view.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(68.0f)));
                            s2Var = view;
                        }
                    } else {
                        ViewGroup.LayoutParams x0Var = new f2.x0(-1, AndroidUtilities.dp(79.0f));
                        View view2 = this.f28894c;
                        view2.setLayoutParams(x0Var);
                        s2Var = view2;
                    }
                } else {
                    s2Var = new org.telegram.ui.Cells.m8(mzVar.getContext(), true, false, mzVar.W1, mzVar.f29286f2);
                }
            } else {
                View view3 = new View(mzVar.getContext());
                view3.setLayoutParams(new f2.x0(-1, mzVar.Y0));
                s2Var = view3;
            }
        } else {
            s2Var = new uy(mzVar.getContext());
        }
        return new f2.m1(s2Var);
    }
}
