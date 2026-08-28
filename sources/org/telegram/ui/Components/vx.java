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
public final class vx extends vk0 {
    public boolean A;
    public final wy B;
    public final qx f34012c;
    public long d;
    public TLRPC.StickerSet f34013e;
    public ArrayList f34014f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f34015n = new ArrayList();
    public final ArrayList f34016r = new ArrayList();
    public final ArrayList f34017s = new ArrayList();
    public String v;
    public String f34018w;
    public ux f34019x;
    public boolean f34020y;

    public vx(wy wyVar, Context context) {
        this.B = wyVar;
        ?? aVar = new vg.a(context, wyVar.Y0, new d(this, 11), new wu(this, 1), wyVar.V1);
        this.f34012c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.U2.f35188r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.d2(this, 1));
    }

    public static void E(vx vxVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        String str;
        wy wyVar = vxVar.B;
        String[] strArr = wyVar.S0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = vxVar.v;
        if (str3 == null) {
            return;
        }
        MediaDataController.getInstance(wyVar.Y0).searchStickers(true, str2, str3, new bg.j1((Object) vxVar, str3, (Object) arrayList, (Object) runnable, 10), z10);
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 0 && i9 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        wy wyVar = this.B;
        ww wwVar = wyVar.L;
        long j10 = 0;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            f2.r0 adapter = wwVar.getAdapter();
            fx fxVar = wyVar.N;
            if (adapter != fxVar) {
                wwVar.setAdapter(fxVar);
                this.f34020y = false;
            }
            this.d = 0L;
            wyVar.f34386b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        ux uxVar = this.f34019x;
        if (uxVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uxVar);
        }
        if (!TextUtils.isEmpty(this.v)) {
            this.f34015n.clear();
            this.A = false;
            wyVar.R.e(true);
            ux uxVar2 = new ux(this);
            this.f34019x = uxVar2;
            if (z10) {
                j10 = 300;
            }
            AndroidUtilities.runOnUIThread(uxVar2, j10);
        }
    }

    @Override
    public final int h() {
        if (this.d != 0) {
            return this.f34014f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f34017s;
        ArrayList arrayList3 = this.f34016r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.f34020y) {
            return this.B.getRecentEmoji().size() + 1;
        }
        int i9 = 2;
        if (arrayList.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
            return 2;
        }
        if (!arrayList2.isEmpty()) {
            i9 = 3;
        } else if (arrayList.isEmpty()) {
            i9 = 1;
        }
        int size = arrayList.size() + i9;
        if (!arrayList3.isEmpty()) {
            return arrayList3.size() + size + 1;
        }
        return size;
    }

    @Override
    public final int j(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vx.j(int):int");
    }

    @Override
    public final void l() {
        this.f34012c.U2.N(false);
        super.l();
    }

    @Override
    public final void v(f2.q1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vx.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        fh.d2 d2Var;
        wy wyVar = this.B;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            fh.d2 d2Var2 = new fh.d2(this, wyVar.getContext(), 16);
                            TextView textView = new TextView(wyVar.getContext());
                            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
                            textView.setTextSize(1, 16.0f);
                            int i10 = org.telegram.ui.ActionBar.f6.Le;
                            textView.setTextColor(wyVar.z(i10));
                            d2Var2.addView(textView, g7.e6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(wyVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.msg_emoji_question);
                            imageView.setColorFilter(new PorterDuffColorFilter(wyVar.z(i10), PorterDuff.Mode.MULTIPLY));
                            d2Var2.addView(imageView, g7.e6.e(48, 48, 85));
                            imageView.setOnClickListener(new sx(this));
                            d2Var2.setLayoutParams(new f2.a1(-1, -2));
                            d2Var = d2Var2;
                        } else {
                            View view = new View(wyVar.getContext());
                            view.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(68.0f)));
                            d2Var = view;
                        }
                    } else {
                        ViewGroup.LayoutParams a1Var = new f2.a1(-1, AndroidUtilities.dp(79.0f));
                        View view2 = this.f34012c;
                        view2.setLayoutParams(a1Var);
                        d2Var = view2;
                    }
                } else {
                    d2Var = new org.telegram.ui.Cells.m8(wyVar.getContext(), true, false, wyVar.V1, wyVar.f34400e2);
                }
            } else {
                View view3 = new View(wyVar.getContext());
                view3.setLayoutParams(new f2.a1(-1, wyVar.X0));
                d2Var = view3;
            }
        } else {
            d2Var = new fy(wyVar.getContext());
        }
        return new f2.q1(d2Var);
    }
}
