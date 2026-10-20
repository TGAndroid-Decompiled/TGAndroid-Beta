package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class dd1 extends org.telegram.ui.Components.im0 {
    public int f36335c;
    public int d;
    public int e;
    public int f36336f;
    public int h;
    public int f36337n;
    public final gd1 f36338r;

    public dd1(gd1 gd1Var) {
        this.f36338r = gd1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.b() >= this.f36336f && b1Var.b() < this.h) {
            return true;
        }
        return false;
    }

    public final void E() {
        this.e = -1;
        this.f36336f = -1;
        this.h = -1;
        this.f36337n = -1;
        this.f36335c = 2;
        this.d = 1;
        ArrayList arrayList = this.f36338r.f37287f;
        if (!arrayList.isEmpty()) {
            int i10 = this.f36335c;
            int i11 = i10 + 1;
            this.e = i10;
            int i12 = i10 + 2;
            this.f36335c = i12;
            this.f36336f = i11;
            int size = (arrayList.size() - 1) + i12;
            this.h = size;
            this.f36335c = size + 1;
            this.f36337n = size;
        }
    }

    @Override
    public final int h() {
        return this.f36335c;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == this.d) {
            return 2;
        }
        if (i10 == this.e) {
            return 3;
        }
        if (i10 == this.f36337n) {
            return 5;
        }
        return 4;
    }

    @Override
    public final void l() {
        E();
        super.l();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.f45917a;
        int i11 = this.e;
        gd1 gd1Var = this.f36338r;
        if (i10 >= i11 && i11 > 0) {
            view.setAlpha(gd1Var.E);
        } else {
            view.setAlpha(1.0f);
        }
        if (j(i10) == 4) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            TLRPC.Chat chat = (TLRPC.Chat) gd1Var.f37287f.get(i10 - this.f36336f);
            String str = (String) gd1Var.h.get(i10 - this.f36336f);
            String str2 = chat.title;
            boolean z10 = true;
            if (i10 == this.h - 1) {
                z10 = false;
            }
            f4Var.e(chat, str2, str, z10);
            f4Var.c(gd1Var.f37291w.contains(Long.valueOf(chat.f20276id)), false);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        String string;
        org.telegram.ui.Cells.l4 l4Var;
        org.telegram.ui.Cells.f4 f4Var;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        f4Var = new org.telegram.ui.Cells.f4(viewGroup.getContext(), 1, 0, false);
                    } else {
                        f4Var = new org.telegram.ui.Cells.k3(viewGroup.getContext(), AndroidUtilities.dp(12.0f));
                    }
                } else {
                    org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(viewGroup.getContext(), org.telegram.ui.ActionBar.h6.L6, 21, 8, false, null);
                    l4Var2.setHeight(54);
                    l4Var2.setText(LocaleController.getString(R.string.InactiveChats));
                    l4Var = l4Var2;
                }
            } else {
                View z6Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
                org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20932a7, false)), org.telegram.ui.ActionBar.h6.W0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f20952b7));
                zqVar.f33023w = true;
                z6Var.setBackground(zqVar);
                f4Var = z6Var;
            }
            l4Var = f4Var;
        } else {
            Context context = viewGroup.getContext();
            ?? frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.h6.f21156m9;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(context);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f22668a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21046g9, false));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            frameLayout.addView(textView2, w7.z5.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            ai.w1 w1Var = new ai.w1(context, new Paint(1), textPaint);
            w1Var.setWillNotDraw(false);
            w1Var.addView(imageView, w7.z5.e(-2, -2, 1));
            frameLayout.addView(w1Var, w7.z5.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(LocaleController.getString(R.string.TooManyCommunities));
            imageView.setImageResource(R.drawable.groups_limit1);
            gd1 gd1Var = this.f36338r;
            gd1Var.f37292x = frameLayout;
            int i12 = gd1Var.G;
            if (i12 == 0) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintJoin);
            } else if (i12 == 1) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintEdit);
            } else {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintCreate);
            }
            gd1Var.f37292x.setMessageText(string);
            s4.o0 o0Var = new s4.o0(-1, -2);
            ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) o0Var).topMargin = AndroidUtilities.dp(23.0f);
            gd1Var.f37292x.setLayoutParams(o0Var);
            l4Var = frameLayout;
        }
        return new s4.b1(l4Var);
    }
}
