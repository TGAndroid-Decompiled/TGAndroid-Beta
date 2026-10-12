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
public final class vy extends lm0 {
    public boolean E;
    public final wz F;
    public final qy f30671c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f30672f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f30673n = new ArrayList();
    public final ArrayList f30674r = new ArrayList();
    public final ArrayList f30675s = new ArrayList();
    public String v;
    public String f30676w;
    public uy f30677x;
    public boolean f30678y;

    public vy(wz wzVar, Context context) {
        this.F = wzVar;
        ?? aVar = new oh.a(context, wzVar.f31014c1, new d(this, 11), new xv(this, 1), wzVar.Z1);
        this.f30671c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.W2.f31780r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(vy vyVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        String str;
        wz wzVar = vyVar.F;
        String[] strArr = wzVar.W0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = vyVar.v;
        if (str3 == null) {
            return;
        }
        MediaDataController.getInstance(wzVar.f31014c1).searchStickers(true, str2, str3, new bi.u3((Object) vyVar, str3, arrayList, (Object) runnable, 9), z10);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 != 0 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        wz wzVar = this.F;
        iy iyVar = wzVar.P;
        long j10 = 0;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            s4.g0 adapter = iyVar.getAdapter();
            fy fyVar = wzVar.R;
            if (adapter != fyVar) {
                iyVar.setAdapter(fyVar);
                this.f30678y = false;
            }
            this.d = 0L;
            wzVar.f31008b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        uy uyVar = this.f30677x;
        if (uyVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uyVar);
        }
        if (!TextUtils.isEmpty(this.v)) {
            this.f30673n.clear();
            this.E = false;
            wzVar.V.e(true);
            uy uyVar2 = new uy(this);
            this.f30677x = uyVar2;
            if (z10) {
                j10 = 300;
            }
            AndroidUtilities.runOnUIThread(uyVar2, j10);
        }
    }

    @Override
    public final int h() {
        if (this.d != 0) {
            return this.f30672f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f30675s;
        ArrayList arrayList3 = this.f30674r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.f30678y) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vy.j(int):int");
    }

    @Override
    public final void l() {
        this.f30671c.W2.N(false);
        super.l();
    }

    @Override
    public final void v(s4.b1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vy.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ah.x xVar;
        wz wzVar = this.F;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            ah.x xVar2 = new ah.x(this, wzVar.getContext(), 14);
                            TextView textView = new TextView(wzVar.getContext());
                            org.telegram.messenger.yh.j(16.0f, R.string.NoEmojiFound, 1, textView);
                            int i11 = org.telegram.ui.ActionBar.g6.Le;
                            textView.setTextColor(wzVar.A(i11));
                            xVar2.addView(textView, w7.a6.a(-2.0f, 0.0f, 10.0f, 0.0f, 0.0f, -2, 49));
                            ImageView imageView = new ImageView(wzVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.msg_emoji_question);
                            imageView.setColorFilter(new PorterDuffColorFilter(wzVar.A(i11), PorterDuff.Mode.MULTIPLY));
                            xVar2.addView(imageView, w7.a6.e(48, 48, 85));
                            imageView.setOnClickListener(new sy(this));
                            xVar2.setLayoutParams(new s4.o0(-1, -2));
                            xVar = xVar2;
                        } else {
                            View view = new View(wzVar.getContext());
                            view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(68.0f)));
                            xVar = view;
                        }
                    } else {
                        ViewGroup.LayoutParams o0Var = new s4.o0(-1, AndroidUtilities.dp(79.0f));
                        View view2 = this.f30671c;
                        view2.setLayoutParams(o0Var);
                        xVar = view2;
                    }
                } else {
                    xVar = new org.telegram.ui.Cells.o8(wzVar.getContext(), true, false, wzVar.Z1, wzVar.f31034i2);
                }
            } else {
                View view3 = new View(wzVar.getContext());
                view3.setLayoutParams(new s4.o0(-1, wzVar.f31010b1));
                xVar = view3;
            }
        } else {
            xVar = new ez(wzVar.getContext());
        }
        return new s4.b1(xVar);
    }
}
