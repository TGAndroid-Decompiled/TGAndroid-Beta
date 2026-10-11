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
public final class az extends qm0 {
    public boolean E;
    public final b00 F;
    public final vy f24704c;
    public long d;
    public TLRPC.StickerSet f24705e;
    public ArrayList f24706f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f24707n = new ArrayList();
    public final ArrayList f24708r = new ArrayList();
    public final ArrayList f24709s = new ArrayList();
    public String v;
    public String f24710w;
    public zy f24711x;
    public boolean f24712y;

    public az(b00 b00Var, Context context) {
        this.F = b00Var;
        ?? aVar = new nh.a(context, b00Var.f24731c1, new d(this, 11), new cw(this, 1), b00Var.Z1);
        this.f24704c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.W2.f25649r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(az azVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        String str;
        b00 b00Var = azVar.F;
        String[] strArr = b00Var.W0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = azVar.v;
        if (str3 == null) {
            return;
        }
        MediaDataController.getInstance(b00Var.f24731c1).searchStickers(true, str2, str3, new ai.f4((Object) azVar, str3, arrayList, (Object) runnable, 9), z10);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47786f;
        if (i10 != 0 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        b00 b00Var = this.F;
        ny nyVar = b00Var.P;
        long j3 = 0;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            s4.i0 adapter = nyVar.getAdapter();
            ky kyVar = b00Var.R;
            if (adapter != kyVar) {
                nyVar.setAdapter(kyVar);
                this.f24712y = false;
            }
            this.d = 0L;
            b00Var.f24725b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        zy zyVar = this.f24711x;
        if (zyVar != null) {
            AndroidUtilities.cancelRunOnUIThread(zyVar);
        }
        if (!TextUtils.isEmpty(this.v)) {
            this.f24707n.clear();
            this.E = false;
            b00Var.V.e(true);
            zy zyVar2 = new zy(this);
            this.f24711x = zyVar2;
            if (z10) {
                j3 = 300;
            }
            AndroidUtilities.runOnUIThread(zyVar2, j3);
        }
    }

    @Override
    public final int h() {
        if (this.d != 0) {
            return this.f24706f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f24709s;
        ArrayList arrayList3 = this.f24708r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.f24712y) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.az.j(int):int");
    }

    @Override
    public final void l() {
        this.f24704c.W2.N(false);
        super.l();
    }

    @Override
    public final void v(s4.d1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.az.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        ai.f0 f0Var;
        b00 b00Var = this.F;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            ai.f0 f0Var2 = new ai.f0(this, b00Var.getContext(), 13);
                            TextView textView = new TextView(b00Var.getContext());
                            org.telegram.messenger.ai.j(16.0f, R.string.NoEmojiFound, 1, textView);
                            int i11 = org.telegram.ui.ActionBar.h6.Le;
                            textView.setTextColor(b00Var.B(i11));
                            f0Var2.addView(textView, w7.x5.a(-2.0f, 0.0f, 10.0f, 0.0f, 0.0f, -2, 49));
                            ImageView imageView = new ImageView(b00Var.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.msg_emoji_question);
                            imageView.setColorFilter(new PorterDuffColorFilter(b00Var.B(i11), PorterDuff.Mode.MULTIPLY));
                            f0Var2.addView(imageView, w7.x5.e(48, 48, 85));
                            imageView.setOnClickListener(new xy(this));
                            f0Var2.setLayoutParams(new s4.q0(-1, -2));
                            f0Var = f0Var2;
                        } else {
                            View view = new View(b00Var.getContext());
                            view.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(68.0f)));
                            f0Var = view;
                        }
                    } else {
                        ViewGroup.LayoutParams q0Var = new s4.q0(-1, AndroidUtilities.dp(79.0f));
                        View view2 = this.f24704c;
                        view2.setLayoutParams(q0Var);
                        f0Var = view2;
                    }
                } else {
                    f0Var = new org.telegram.ui.Cells.o8(b00Var.getContext(), true, false, b00Var.Z1, b00Var.f24752i2);
                }
            } else {
                View view3 = new View(b00Var.getContext());
                view3.setLayoutParams(new s4.q0(-1, b00Var.f24727b1));
                f0Var = view3;
            }
        } else {
            f0Var = new jz(b00Var.getContext());
        }
        return new s4.d1(f0Var);
    }
}
