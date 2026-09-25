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
public final class ly extends vl0 {
    public boolean E;
    public final lz F;
    public final gy f26220c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f26221f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f26222n = new ArrayList();
    public final ArrayList f26223r = new ArrayList();
    public final ArrayList f26224s = new ArrayList();
    public String v;
    public String f26225w;
    public ky f26226x;
    public boolean f26227y;

    public ly(lz lzVar, Context context) {
        this.F = lzVar;
        ?? aVar = new nh.a(context, lzVar.f26237c1, new d(this, 11), new mv(this, 1), lzVar.Z1);
        this.f26220c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.Y2.f25291r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.c2(this, 1));
    }

    public static void E(ly lyVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        String str;
        lz lzVar = lyVar.F;
        String[] strArr = lzVar.W0;
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
        MediaDataController.getInstance(lzVar.f26237c1).searchStickers(true, str2, str3, new ai.e4((Object) lyVar, str3, arrayList, (Object) runnable, 9), z10);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42964f;
        if (i10 != 0 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        lz lzVar = this.F;
        xx xxVar = lzVar.P;
        long j3 = 0;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            s4.h0 adapter = xxVar.getAdapter();
            ux uxVar = lzVar.R;
            if (adapter != uxVar) {
                xxVar.setAdapter(uxVar);
                this.f26227y = false;
            }
            this.d = 0L;
            lzVar.f26231b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        ky kyVar = this.f26226x;
        if (kyVar != null) {
            AndroidUtilities.cancelRunOnUIThread(kyVar);
        }
        if (!TextUtils.isEmpty(this.v)) {
            this.f26222n.clear();
            this.E = false;
            lzVar.V.e(true);
            ky kyVar2 = new ky(this);
            this.f26226x = kyVar2;
            if (z10) {
                j3 = 300;
            }
            AndroidUtilities.runOnUIThread(kyVar2, j3);
        }
    }

    @Override
    public final int h() {
        if (this.d != 0) {
            return this.f26221f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f26224s;
        ArrayList arrayList3 = this.f26223r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.f26227y) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ly.j(int):int");
    }

    @Override
    public final void l() {
        this.f26220c.Y2.N(false);
        super.l();
    }

    @Override
    public final void v(s4.c1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ly.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ai.f0 f0Var;
        lz lzVar = this.F;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            ai.f0 f0Var2 = new ai.f0(this, lzVar.getContext(), 13);
                            TextView textView = new TextView(lzVar.getContext());
                            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
                            textView.setTextSize(1, 16.0f);
                            int i11 = org.telegram.ui.ActionBar.h6.Le;
                            textView.setTextColor(lzVar.z(i11));
                            f0Var2.addView(textView, w7.y5.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(lzVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.msg_emoji_question);
                            imageView.setColorFilter(new PorterDuffColorFilter(lzVar.z(i11), PorterDuff.Mode.MULTIPLY));
                            f0Var2.addView(imageView, w7.y5.e(48, 48, 85));
                            imageView.setOnClickListener(new iy(this));
                            f0Var2.setLayoutParams(new s4.p0(-1, -2));
                            f0Var = f0Var2;
                        } else {
                            View view = new View(lzVar.getContext());
                            view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(68.0f)));
                            f0Var = view;
                        }
                    } else {
                        ViewGroup.LayoutParams p0Var = new s4.p0(-1, AndroidUtilities.dp(79.0f));
                        View view2 = this.f26220c;
                        view2.setLayoutParams(p0Var);
                        f0Var = view2;
                    }
                } else {
                    f0Var = new org.telegram.ui.Cells.o8(lzVar.getContext(), true, false, lzVar.Z1, lzVar.f26257i2);
                }
            } else {
                View view3 = new View(lzVar.getContext());
                view3.setLayoutParams(new s4.p0(-1, lzVar.f26233b1));
                f0Var = view3;
            }
        } else {
            f0Var = new uy(lzVar.getContext());
        }
        return new s4.c1(f0Var);
    }
}
