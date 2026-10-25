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
public final class md1 extends org.telegram.ui.Components.lm0 {
    public int f41532c;
    public int d;
    public int e;
    public int f41533f;
    public int h;
    public int f41534n;
    public final pd1 f41535r;

    public md1(pd1 pd1Var) {
        this.f41535r = pd1Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.b() >= this.f41533f && e1Var.b() < this.h) {
            return true;
        }
        return false;
    }

    public final void E() {
        this.e = -1;
        this.f41533f = -1;
        this.h = -1;
        this.f41534n = -1;
        this.f41532c = 2;
        this.d = 1;
        ArrayList arrayList = this.f41535r.f42471f;
        if (!arrayList.isEmpty()) {
            int i10 = this.f41532c;
            int i11 = i10 + 1;
            this.e = i10;
            int i12 = i10 + 2;
            this.f41532c = i12;
            this.f41533f = i11;
            int size = (arrayList.size() - 1) + i12;
            this.h = size;
            this.f41532c = size + 1;
            this.f41534n = size;
        }
    }

    @Override
    public final int h() {
        return this.f41532c;
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
        if (i10 == this.f41534n) {
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
    public final void v(s4.e1 e1Var, int i10) {
        View view = e1Var.f47735a;
        int i11 = this.e;
        pd1 pd1Var = this.f41535r;
        if (i10 >= i11 && i11 > 0) {
            view.setAlpha(pd1Var.E);
        } else {
            view.setAlpha(1.0f);
        }
        if (j(i10) == 4) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            TLRPC.Chat chat = (TLRPC.Chat) pd1Var.f42471f.get(i10 - this.f41533f);
            String str = (String) pd1Var.h.get(i10 - this.f41533f);
            String str2 = chat.title;
            boolean z10 = true;
            if (i10 == this.h - 1) {
                z10 = false;
            }
            k4Var.e(chat, str2, str, z10);
            k4Var.c(pd1Var.f42475w.contains(Long.valueOf(chat.f22027id)), false);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        String string;
        org.telegram.ui.Cells.q4 q4Var;
        org.telegram.ui.Cells.k4 k4Var;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        k4Var = new org.telegram.ui.Cells.k4(viewGroup.getContext(), 1, 0, false);
                    } else {
                        k4Var = new org.telegram.ui.Cells.i3(viewGroup.getContext(), AndroidUtilities.dp(12.0f));
                    }
                } else {
                    org.telegram.ui.Cells.q4 q4Var2 = new org.telegram.ui.Cells.q4(viewGroup.getContext(), org.telegram.ui.ActionBar.y6.L6, 21, 8, false, null);
                    q4Var2.setHeight(54);
                    q4Var2.setText(LocaleController.getString(R.string.InactiveChats));
                    q4Var = q4Var2;
                }
            } else {
                View f7Var = new org.telegram.ui.Cells.f7(viewGroup.getContext(), (d3) null);
                Drawable X0 = org.telegram.ui.ActionBar.y6.X0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.y6.f23316b7);
                int i11 = org.telegram.ui.ActionBar.y6.f23297a7;
                ColorDrawable colorDrawable = new ColorDrawable(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
                org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(colorDrawable, X0);
                arVar.f26597w = true;
                f7Var.setBackground(arVar);
                org.telegram.ui.ActionBar.f7.y(f7Var, colorDrawable, i11, null, PorterDuff.Mode.SRC_IN);
                k4Var = f7Var;
            }
            q4Var = k4Var;
        } else {
            Context context = viewGroup.getContext();
            ?? frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            int i12 = org.telegram.ui.ActionBar.y6.f23521m9;
            org.telegram.ui.ActionBar.f7.t(imageView, i12, null, PorterDuff.Mode.MULTIPLY);
            TextView textView = new TextView(context);
            org.telegram.messenger.t.r(textView, i12, null, 1, 20.0f);
            textView.setGravity(17);
            frameLayout.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f25419a = textView2;
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23412g9, null);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            frameLayout.addView(textView2, org.telegram.ui.Components.gb1.h(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            bi.t1 t1Var = new bi.t1(context, new Paint(1), textPaint);
            t1Var.setWillNotDraw(false);
            t1Var.addView(imageView, org.telegram.ui.Components.gb1.i(-2, -2, 1));
            frameLayout.addView(t1Var, org.telegram.ui.Components.gb1.h(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(LocaleController.getString(R.string.TooManyCommunities));
            imageView.setImageResource(R.drawable.groups_limit1);
            pd1 pd1Var = this.f41535r;
            pd1Var.f42476x = frameLayout;
            int i13 = pd1Var.G;
            if (i13 == 0) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintJoin);
            } else if (i13 == 1) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintEdit);
            } else {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintCreate);
            }
            pd1Var.f42476x.setMessageText(string);
            s4.q0 q0Var = new s4.q0(-1, -2);
            ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) q0Var).topMargin = AndroidUtilities.dp(23.0f);
            pd1Var.f42476x.setLayoutParams(q0Var);
            q4Var = frameLayout;
        }
        return new s4.e1(q4Var);
    }
}
