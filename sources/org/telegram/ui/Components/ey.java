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
public final class ey extends il0 {
    public boolean A;
    public final fz B;
    public final yx f28195c;
    public long d;
    public TLRPC.StickerSet f28196e;
    public ArrayList f28197f;
    public final ArrayList h = new ArrayList();
    public final ArrayList f28198n = new ArrayList();
    public final ArrayList f28199r = new ArrayList();
    public final ArrayList f28200s = new ArrayList();
    public String v;
    public String f28201w;
    public dy f28202x;
    public boolean f28203y;

    public ey(fz fzVar, Context context) {
        this.B = fzVar;
        ?? aVar = new yg.a(context, fzVar.Y0, new d(this, 11), new cv(this, 1), fzVar.V1);
        this.f28195c = aVar;
        aVar.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f));
        aVar.setClipToPadding(false);
        aVar.U2.f29939r = false;
        aVar.setNestedScrollingEnabled(false);
        aVar.setDrawSelection(false);
        aVar.setOnTouchListener(new m.d2(this, 1));
    }

    public static void E(ey eyVar, Runnable runnable, ArrayList arrayList, boolean z10) {
        String str;
        fz fzVar = eyVar.B;
        String[] strArr = fzVar.S0;
        if (strArr != null && strArr.length != 0) {
            str = strArr[0];
        } else {
            str = "";
        }
        String str2 = str;
        String str3 = eyVar.v;
        if (str3 == null) {
            return;
        }
        MediaDataController.getInstance(fzVar.Y0).searchStickers(true, str2, str3, new eg.d1((Object) eyVar, str3, (Object) arrayList, (Object) runnable, 10), z10);
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 0 && i10 != 4) {
            return false;
        }
        return true;
    }

    public final void F(String str, boolean z10) {
        fz fzVar = this.B;
        dx dxVar = fzVar.L;
        long j10 = 0;
        if (TextUtils.isEmpty(str)) {
            this.v = null;
            f2.p0 adapter = dxVar.getAdapter();
            nx nxVar = fzVar.N;
            if (adapter != nxVar) {
                dxVar.setAdapter(nxVar);
                this.f28203y = false;
            }
            this.d = 0L;
            fzVar.f28577b.a(false, true);
            l();
        } else {
            this.v = str.toLowerCase();
        }
        dy dyVar = this.f28202x;
        if (dyVar != null) {
            AndroidUtilities.cancelRunOnUIThread(dyVar);
        }
        if (!TextUtils.isEmpty(this.v)) {
            this.f28198n.clear();
            this.A = false;
            fzVar.R.e(true);
            dy dyVar2 = new dy(this);
            this.f28202x = dyVar2;
            if (z10) {
                j10 = 300;
            }
            AndroidUtilities.runOnUIThread(dyVar2, j10);
        }
    }

    @Override
    public final int h() {
        if (this.d != 0) {
            return this.f28197f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f28200s;
        ArrayList arrayList3 = this.f28199r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.f28203y) {
            return this.B.getRecentEmoji().size() + 1;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ey.j(int):int");
    }

    @Override
    public final void l() {
        this.f28195c.U2.N(false);
        super.l();
    }

    @Override
    public final void v(f2.n1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ey.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        bg.x2 x2Var;
        fz fzVar = this.B;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            bg.x2 x2Var2 = new bg.x2(this, fzVar.getContext(), 21);
                            TextView textView = new TextView(fzVar.getContext());
                            textView.setText(LocaleController.getString(R.string.NoEmojiFound));
                            textView.setTextSize(1, 16.0f);
                            int i11 = org.telegram.ui.ActionBar.g6.Le;
                            textView.setTextColor(fzVar.A(i11));
                            x2Var2.addView(textView, i7.f6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                            ImageView imageView = new ImageView(fzVar.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(R.drawable.msg_emoji_question);
                            imageView.setColorFilter(new PorterDuffColorFilter(fzVar.A(i11), PorterDuff.Mode.MULTIPLY));
                            x2Var2.addView(imageView, i7.f6.e(48, 48, 85));
                            imageView.setOnClickListener(new ay(this));
                            x2Var2.setLayoutParams(new f2.x0(-1, -2));
                            x2Var = x2Var2;
                        } else {
                            View view = new View(fzVar.getContext());
                            view.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(68.0f)));
                            x2Var = view;
                        }
                    } else {
                        ViewGroup.LayoutParams x0Var = new f2.x0(-1, AndroidUtilities.dp(79.0f));
                        View view2 = this.f28195c;
                        view2.setLayoutParams(x0Var);
                        x2Var = view2;
                    }
                } else {
                    x2Var = new org.telegram.ui.Cells.k8(fzVar.getContext(), true, false, fzVar.V1, fzVar.f28591e2);
                }
            } else {
                View view3 = new View(fzVar.getContext());
                view3.setLayoutParams(new f2.x0(-1, fzVar.X0));
                x2Var = view3;
            }
        } else {
            x2Var = new ny(fzVar.getContext());
        }
        return new f2.n1(x2Var);
    }
}
