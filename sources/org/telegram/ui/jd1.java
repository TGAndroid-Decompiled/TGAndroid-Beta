package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
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
public final class jd1 extends org.telegram.ui.Components.lm0 {
    public int f38532c;
    public int d;
    public int e;
    public int f38533f;
    public int h;
    public int f38534n;
    public final md1 f38535r;

    public jd1(md1 md1Var) {
        this.f38535r = md1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.b() >= this.f38533f && b1Var.b() < this.h) {
            return true;
        }
        return false;
    }

    public final void E() {
        this.e = -1;
        this.f38533f = -1;
        this.h = -1;
        this.f38534n = -1;
        this.f38532c = 2;
        this.d = 1;
        ArrayList arrayList = this.f38535r.f39514f;
        if (!arrayList.isEmpty()) {
            int i10 = this.f38532c;
            int i11 = i10 + 1;
            this.e = i10;
            int i12 = i10 + 2;
            this.f38532c = i12;
            this.f38533f = i11;
            int size = (arrayList.size() - 1) + i12;
            this.h = size;
            this.f38532c = size + 1;
            this.f38534n = size;
        }
    }

    @Override
    public final int h() {
        return this.f38532c;
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
        if (i10 == this.f38534n) {
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
        View view = b1Var.f46343a;
        int i11 = this.e;
        md1 md1Var = this.f38535r;
        if (i10 >= i11 && i11 > 0) {
            view.setAlpha(md1Var.E);
        } else {
            view.setAlpha(1.0f);
        }
        if (j(i10) == 4) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            TLRPC.Chat chat = (TLRPC.Chat) md1Var.f39514f.get(i10 - this.f38533f);
            String str = (String) md1Var.h.get(i10 - this.f38533f);
            String str2 = chat.title;
            boolean z10 = true;
            if (i10 == this.h - 1) {
                z10 = false;
            }
            f4Var.e(chat, str2, str, z10);
            f4Var.c(md1Var.f39518w.contains(Long.valueOf(chat.f20343id)), false);
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
                        f4Var = new org.telegram.ui.Cells.j3(viewGroup.getContext(), AndroidUtilities.dp(12.0f));
                    }
                } else {
                    org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(viewGroup.getContext(), org.telegram.ui.ActionBar.k6.L6, 21, 8, false, null);
                    l4Var2.setHeight(54);
                    l4Var2.setText(LocaleController.getString(R.string.InactiveChats));
                    l4Var = l4Var2;
                }
            } else {
                View b7Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.b1) null);
                Drawable X0 = org.telegram.ui.ActionBar.k6.X0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21145b7);
                int i11 = org.telegram.ui.ActionBar.k6.f21125a7;
                ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
                org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(colorDrawable, X0);
                yqVar.f33019w = true;
                b7Var.setBackground(yqVar);
                org.telegram.ui.ActionBar.r6.z(b7Var, colorDrawable, i11, null, PorterDuff.Mode.SRC_IN);
                f4Var = b7Var;
            }
            l4Var = f4Var;
        } else {
            Context context = viewGroup.getContext();
            ?? frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            int i12 = org.telegram.ui.ActionBar.k6.f21349m9;
            org.telegram.ui.ActionBar.r6.t(imageView, i12, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(context);
            org.telegram.messenger.v0.q(textView, i12, null, 1, 20.0f);
            textView.setGravity(17);
            frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f22872a = textView2;
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21239g9, null);
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
            md1 md1Var = this.f38535r;
            md1Var.f39519x = frameLayout;
            int i13 = md1Var.G;
            if (i13 == 0) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintJoin);
            } else if (i13 == 1) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintEdit);
            } else {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintCreate);
            }
            md1Var.f39519x.setMessageText(string);
            s4.o0 o0Var = new s4.o0(-1, -2);
            ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) o0Var).topMargin = AndroidUtilities.dp(23.0f);
            md1Var.f39519x.setLayoutParams(o0Var);
            l4Var = frameLayout;
        }
        return new s4.b1(l4Var);
    }
}
