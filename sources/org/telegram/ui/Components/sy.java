package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
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
public final class sy extends mm0 {
    public boolean E;
    public final sz F;
    public final ly f32695c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f32696f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f32697n = new ArrayList();
    public final ArrayList f32698r = new ArrayList();
    public final ArrayList f32699s = new ArrayList();
    public String v;
    public String f32700w;
    public ry f32701x;
    public boolean f32702y;

    public sy(sz szVar, Context context) {
        this.F = szVar;
        ?? aVar = new ph.a(context, szVar.f32713c1, new d(this, 11), new tv(this, 1), szVar.Z1);
        this.f32695c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.f32504g3.f29878r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(sy syVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        String str;
        sz szVar = syVar.F;
        String[] strArr = szVar.W0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = syVar.v;
        if (str3 == null) {
            return;
        }
        MediaDataController.getInstance(szVar.f32713c1).searchStickers(true, str2, str3, new di.y2((Object) syVar, str3, arrayList, (Object) runnable, 9), z10);
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 != 0 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        sz szVar = this.F;
        dy dyVar = szVar.P;
        long j10 = 0;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            s4.h0 adapter = dyVar.getAdapter();
            zx zxVar = szVar.R;
            if (adapter != zxVar) {
                dyVar.setAdapter(zxVar);
                this.f32702y = false;
            }
            this.d = 0L;
            szVar.f32707b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        ry ryVar = this.f32701x;
        if (ryVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ryVar);
        }
        if (!TextUtils.isEmpty(this.v)) {
            this.f32697n.clear();
            this.E = false;
            szVar.V.e(true);
            ry ryVar2 = new ry(this);
            this.f32701x = ryVar2;
            if (z10) {
                j10 = 300;
            }
            AndroidUtilities.runOnUIThread(ryVar2, j10);
        }
    }

    @Override
    public final int h() {
        if (this.d != 0) {
            return this.f32696f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f32699s;
        ArrayList arrayList3 = this.f32698r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.f32702y) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sy.j(int):int");
    }

    @Override
    public final void l() {
        this.f32695c.f32504g3.O(false);
        super.l();
    }

    @Override
    public final void v(s4.e1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sy.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        bh.r rVar;
        sz szVar = this.F;
        org.telegram.ui.ActionBar.u6 u6Var = szVar.Z1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            bh.r rVar2 = new bh.r(this, szVar.getContext(), 16);
                            TextView textView = new TextView(szVar.getContext());
                            org.telegram.ui.d3.o(R.string.NoEmojiFound, textView, 1, 16.0f);
                            int i11 = org.telegram.ui.ActionBar.y6.Le;
                            org.telegram.ui.ActionBar.f7.V(textView, i11, u6Var);
                            rVar2.addView(textView, kb1.h(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(szVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.msg_emoji_question);
                            org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, PorterDuff.Mode.MULTIPLY);
                            rVar2.addView(imageView, kb1.i(48, 48, 85));
                            imageView.setOnClickListener(new ny(this));
                            rVar2.setLayoutParams(new s4.q0(-1, -2));
                            rVar = rVar2;
                        } else {
                            View view = new View(szVar.getContext());
                            view.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(68.0f)));
                            rVar = view;
                        }
                    } else {
                        ViewGroup.LayoutParams q0Var = new s4.q0(-1, AndroidUtilities.dp(79.0f));
                        View view2 = this.f32695c;
                        view2.setLayoutParams(q0Var);
                        rVar = view2;
                    }
                } else {
                    rVar = new org.telegram.ui.Cells.s8(szVar.getContext(), true, false, szVar.Z1, szVar.f32733i2);
                }
            } else {
                View view3 = new View(szVar.getContext());
                view3.setLayoutParams(new s4.q0(-1, szVar.f32709b1));
                rVar = view3;
            }
        } else {
            rVar = new bz(szVar.getContext());
        }
        return new s4.e1(rVar);
    }
}
