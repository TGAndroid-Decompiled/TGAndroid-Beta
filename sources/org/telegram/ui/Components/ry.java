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
public final class ry extends ul0 {
    public boolean E;
    public final rz F;
    public final ly f26778c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f26779f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f26780n = new ArrayList();
    public final ArrayList f26781r = new ArrayList();
    public final ArrayList f26782s = new ArrayList();
    public String v;
    public String f26783w;
    public qy f26784x;
    public boolean f26785y;

    public ry(rz rzVar, Context context) {
        this.F = rzVar;
        ?? aVar = new mh.a(context, rzVar.f26805c1, new e(this, 11), new pv(this, 1), rzVar.Z1);
        this.f26778c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.Y2.f24250r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.c2(this, 1));
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
        MediaDataController.getInstance(rzVar.f26805c1).searchStickers(true, str2, str3, new gg.u1(ryVar, str3, arrayList, runnable, 6), z10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 != 0 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        rz rzVar = this.F;
        px pxVar = rzVar.P;
        long j3 = 0;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            s4.h0 adapter = pxVar.getAdapter();
            yx yxVar = rzVar.R;
            if (adapter != yxVar) {
                pxVar.setAdapter(yxVar);
                this.f26785y = false;
            }
            this.d = 0L;
            rzVar.f26799b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        qy qyVar = this.f26784x;
        if (qyVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qyVar);
        }
        if (!TextUtils.isEmpty(this.v)) {
            this.f26780n.clear();
            this.E = false;
            rzVar.V.e(true);
            qy qyVar2 = new qy(this);
            this.f26784x = qyVar2;
            if (z10) {
                j3 = 300;
            }
            AndroidUtilities.runOnUIThread(qyVar2, j3);
        }
    }

    @Override
    public final int h() {
        if (this.d != 0) {
            return this.f26779f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f26782s;
        ArrayList arrayList3 = this.f26781r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.f26785y) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ry.j(int):int");
    }

    @Override
    public final void l() {
        this.f26778c.Y2.N(false);
        super.l();
    }

    @Override
    public final void v(s4.c1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ry.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        bi.ld ldVar;
        rz rzVar = this.F;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            bi.ld ldVar2 = new bi.ld(this, rzVar.getContext(), 11);
                            TextView textView = new TextView(rzVar.getContext());
                            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
                            textView.setTextSize(1, 16.0f);
                            int i11 = org.telegram.ui.ActionBar.j6.Le;
                            textView.setTextColor(rzVar.z(i11));
                            ldVar2.addView(textView, w7.a6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(rzVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.msg_emoji_question);
                            imageView.setColorFilter(new PorterDuffColorFilter(rzVar.z(i11), PorterDuff.Mode.MULTIPLY));
                            ldVar2.addView(imageView, w7.a6.e(48, 48, 85));
                            imageView.setOnClickListener(new oy(this));
                            ldVar2.setLayoutParams(new s4.p0(-1, -2));
                            ldVar = ldVar2;
                        } else {
                            View view = new View(rzVar.getContext());
                            view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(68.0f)));
                            ldVar = view;
                        }
                    } else {
                        ViewGroup.LayoutParams p0Var = new s4.p0(-1, AndroidUtilities.dp(79.0f));
                        View view2 = this.f26778c;
                        view2.setLayoutParams(p0Var);
                        ldVar = view2;
                    }
                } else {
                    ldVar = new org.telegram.ui.Cells.p8(rzVar.getContext(), true, false, rzVar.Z1, rzVar.f26825i2);
                }
            } else {
                View view3 = new View(rzVar.getContext());
                view3.setLayoutParams(new s4.p0(-1, rzVar.f26801b1));
                ldVar = view3;
            }
        } else {
            ldVar = new az(rzVar.getContext());
        }
        return new s4.c1(ldVar);
    }
}
