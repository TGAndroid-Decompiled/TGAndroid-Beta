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
public final class ry extends km0 {
    public boolean E;
    public final rz F;
    public final ky f30290c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f30291f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f30292n = new ArrayList();
    public final ArrayList f30293r = new ArrayList();
    public final ArrayList f30294s = new ArrayList();
    public String v;
    public String f30295w;
    public qy f30296x;
    public boolean f30297y;

    public ry(rz rzVar, Context context) {
        this.F = rzVar;
        ?? aVar = new oh.a(context, rzVar.f30310c1, new d(this, 11), new rv(this, 1), rzVar.Z1);
        this.f30290c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.Z2.f24646r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.d2(this, 1));
    }

    public static void E(ry ryVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        String str;
        rz rzVar = ryVar.F;
        String[] strArr = rzVar.W0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = ryVar.v;
        if (str3 == null) {
            return;
        }
        MediaDataController.getInstance(rzVar.f30310c1).searchStickers(true, str2, str3, new ci.y2((Object) ryVar, str3, arrayList, (Object) runnable, 9), z10);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
        if (i10 != 0 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        rz rzVar = this.F;
        cy cyVar = rzVar.P;
        long j10 = 0;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            s4.g0 adapter = cyVar.getAdapter();
            yx yxVar = rzVar.R;
            if (adapter != yxVar) {
                cyVar.setAdapter(yxVar);
                this.f30297y = false;
            }
            this.d = 0L;
            rzVar.f30304b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        qy qyVar = this.f30296x;
        if (qyVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qyVar);
        }
        if (!TextUtils.isEmpty(this.v)) {
            this.f30292n.clear();
            this.E = false;
            rzVar.V.e(true);
            qy qyVar2 = new qy(this);
            this.f30296x = qyVar2;
            if (z10) {
                j10 = 300;
            }
            AndroidUtilities.runOnUIThread(qyVar2, j10);
        }
    }

    @Override
    public final int h() {
        if (this.d != 0) {
            return this.f30291f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f30294s;
        ArrayList arrayList3 = this.f30293r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.f30297y) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ry.j(int):int");
    }

    @Override
    public final void l() {
        this.f30290c.Z2.N(false);
        super.l();
    }

    @Override
    public final void v(s4.b1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ry.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ah.x xVar;
        rz rzVar = this.F;
        org.telegram.ui.ActionBar.g6 g6Var = rzVar.Z1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            ah.x xVar2 = new ah.x(this, rzVar.getContext(), 16);
                            TextView textView = new TextView(rzVar.getContext());
                            org.telegram.messenger.tl.n(R.string.NoEmojiFound, textView, 1, 16.0f);
                            int i11 = org.telegram.ui.ActionBar.k6.Le;
                            org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
                            xVar2.addView(textView, w7.z5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(rzVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.msg_emoji_question);
                            org.telegram.ui.ActionBar.r6.t(imageView, i11, g6Var, PorterDuff.Mode.MULTIPLY);
                            xVar2.addView(imageView, w7.z5.e(48, 48, 85));
                            imageView.setOnClickListener(new my(this));
                            xVar2.setLayoutParams(new s4.o0(-1, -2));
                            xVar = xVar2;
                        } else {
                            View view = new View(rzVar.getContext());
                            view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(68.0f)));
                            xVar = view;
                        }
                    } else {
                        ViewGroup.LayoutParams o0Var = new s4.o0(-1, AndroidUtilities.dp(79.0f));
                        View view2 = this.f30290c;
                        view2.setLayoutParams(o0Var);
                        xVar = view2;
                    }
                } else {
                    xVar = new org.telegram.ui.Cells.o8(rzVar.getContext(), true, false, rzVar.Z1, rzVar.f30330i2);
                }
            } else {
                View view3 = new View(rzVar.getContext());
                view3.setLayoutParams(new s4.o0(-1, rzVar.f30306b1));
                xVar = view3;
            }
        } else {
            xVar = new az(rzVar.getContext());
        }
        return new s4.b1(xVar);
    }
}
