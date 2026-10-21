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
public final class ty extends im0 {
    public boolean E;
    public final tz F;
    public final my f30706c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f30707f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f30708n = new ArrayList();
    public final ArrayList f30709r = new ArrayList();
    public final ArrayList f30710s = new ArrayList();
    public String v;
    public String f30711w;
    public sy f30712x;
    public boolean f30713y;

    public ty(tz tzVar, Context context) {
        this.F = tzVar;
        ?? aVar = new oh.a(context, tzVar.f30723c1, new d(this, 11), new tv(this, 1), tzVar.Z1);
        this.f30706c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.W2.f30861r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.d2(this, 1));
    }

    public static void E(ty tyVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        String str;
        tz tzVar = tyVar.F;
        String[] strArr = tzVar.W0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = tyVar.v;
        if (str3 == null) {
            return;
        }
        MediaDataController.getInstance(tzVar.f30723c1).searchStickers(true, str2, str3, new ci.z2((Object) tyVar, str3, arrayList, (Object) runnable, 9), z10);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45920f;
        if (i10 != 0 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        tz tzVar = this.F;
        ey eyVar = tzVar.P;
        long j10 = 0;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            s4.g0 adapter = eyVar.getAdapter();
            ay ayVar = tzVar.R;
            if (adapter != ayVar) {
                eyVar.setAdapter(ayVar);
                this.f30713y = false;
            }
            this.d = 0L;
            tzVar.f30717b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        sy syVar = this.f30712x;
        if (syVar != null) {
            AndroidUtilities.cancelRunOnUIThread(syVar);
        }
        if (!TextUtils.isEmpty(this.v)) {
            this.f30708n.clear();
            this.E = false;
            tzVar.V.e(true);
            sy syVar2 = new sy(this);
            this.f30712x = syVar2;
            if (z10) {
                j10 = 300;
            }
            AndroidUtilities.runOnUIThread(syVar2, j10);
        }
    }

    @Override
    public final int h() {
        if (this.d != 0) {
            return this.f30707f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f30710s;
        ArrayList arrayList3 = this.f30709r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.f30713y) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ty.j(int):int");
    }

    @Override
    public final void l() {
        this.f30706c.W2.N(false);
        super.l();
    }

    @Override
    public final void v(s4.b1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ty.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ah.x xVar;
        tz tzVar = this.F;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            ah.x xVar2 = new ah.x(this, tzVar.getContext(), 16);
                            TextView textView = new TextView(tzVar.getContext());
                            org.telegram.messenger.mk.j(16.0f, R.string.NoEmojiFound, 1, textView);
                            int i11 = org.telegram.ui.ActionBar.h6.Le;
                            textView.setTextColor(tzVar.A(i11));
                            xVar2.addView(textView, w7.z5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(tzVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.msg_emoji_question);
                            imageView.setColorFilter(new PorterDuffColorFilter(tzVar.A(i11), PorterDuff.Mode.MULTIPLY));
                            xVar2.addView(imageView, w7.z5.e(48, 48, 85));
                            imageView.setOnClickListener(new oy(this));
                            xVar2.setLayoutParams(new s4.o0(-1, -2));
                            xVar = xVar2;
                        } else {
                            View view = new View(tzVar.getContext());
                            view.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(68.0f)));
                            xVar = view;
                        }
                    } else {
                        ViewGroup.LayoutParams o0Var = new s4.o0(-1, AndroidUtilities.dp(79.0f));
                        View view2 = this.f30706c;
                        view2.setLayoutParams(o0Var);
                        xVar = view2;
                    }
                } else {
                    xVar = new org.telegram.ui.Cells.n8(tzVar.getContext(), true, false, tzVar.Z1, tzVar.f30743i2);
                }
            } else {
                View view3 = new View(tzVar.getContext());
                view3.setLayoutParams(new s4.o0(-1, tzVar.f30719b1));
                xVar = view3;
            }
        } else {
            xVar = new cz(tzVar.getContext());
        }
        return new s4.b1(xVar);
    }
}
