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
public final class jd1 extends org.telegram.ui.Components.il0 {
    public int f39516c;
    public int d;
    public int f39517e;
    public int f39518f;
    public int h;
    public int f39519n;
    public final md1 f39520r;

    public jd1(md1 md1Var) {
        this.f39520r = md1Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.b() >= this.f39518f && n1Var.b() < this.h) {
            return true;
        }
        return false;
    }

    public final void E() {
        this.f39517e = -1;
        this.f39518f = -1;
        this.h = -1;
        this.f39519n = -1;
        this.f39516c = 2;
        this.d = 1;
        ArrayList arrayList = this.f39520r.f40533f;
        if (!arrayList.isEmpty()) {
            int i10 = this.f39516c;
            int i11 = i10 + 1;
            this.f39517e = i10;
            int i12 = i10 + 2;
            this.f39516c = i12;
            this.f39518f = i11;
            int size = (arrayList.size() - 1) + i12;
            this.h = size;
            this.f39516c = size + 1;
            this.f39519n = size;
        }
    }

    @Override
    public final int h() {
        return this.f39516c;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == this.d) {
            return 2;
        }
        if (i10 == this.f39517e) {
            return 3;
        }
        if (i10 == this.f39519n) {
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
    public final void v(f2.n1 n1Var, int i10) {
        View view = n1Var.f6432a;
        int i11 = this.f39517e;
        md1 md1Var = this.f39520r;
        if (i10 >= i11 && i11 > 0) {
            view.setAlpha(md1Var.A);
        } else {
            view.setAlpha(1.0f);
        }
        if (j(i10) == 4) {
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            TLRPC.Chat chat = (TLRPC.Chat) md1Var.f40533f.get(i10 - this.f39518f);
            String str = (String) md1Var.h.get(i10 - this.f39518f);
            String str2 = chat.title;
            boolean z10 = true;
            if (i10 == this.h - 1) {
                z10 = false;
            }
            e4Var.e(chat, str2, str, z10);
            e4Var.c(md1Var.f40537w.contains(Long.valueOf(chat.f22392id)), false);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        String string;
        org.telegram.ui.Cells.k4 k4Var;
        org.telegram.ui.Cells.e4 e4Var;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        e4Var = new org.telegram.ui.Cells.e4(viewGroup.getContext(), 1, 0, false);
                    } else {
                        e4Var = new org.telegram.ui.Cells.i3(viewGroup.getContext(), AndroidUtilities.dp(12.0f));
                    }
                } else {
                    org.telegram.ui.Cells.k4 k4Var2 = new org.telegram.ui.Cells.k4(viewGroup.getContext(), org.telegram.ui.ActionBar.g6.L6, 21, 8, false, null);
                    k4Var2.setHeight(54);
                    k4Var2.setText(LocaleController.getString(R.string.InactiveChats));
                    k4Var = k4Var2;
                }
            } else {
                View x6Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (b) null);
                org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false)), org.telegram.ui.ActionBar.g6.V0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23028b7));
                jqVar.f29792w = true;
                x6Var.setBackground(jqVar);
                e4Var = x6Var;
            }
            k4Var = e4Var;
        } else {
            Context context = viewGroup.getContext();
            ?? frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.g6.f23226m9;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(context);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            frameLayout.addView(textView, i7.f6.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f24613a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23120g9, false));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            frameLayout.addView(textView2, i7.f6.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            bg.z3 z3Var = new bg.z3(context, new Paint(1), textPaint);
            z3Var.setWillNotDraw(false);
            z3Var.addView(imageView, i7.f6.e(-2, -2, 1));
            frameLayout.addView(z3Var, i7.f6.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(LocaleController.getString(R.string.TooManyCommunities));
            imageView.setImageResource(R.drawable.groups_limit1);
            md1 md1Var = this.f39520r;
            md1Var.f40538x = frameLayout;
            int i12 = md1Var.C;
            if (i12 == 0) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintJoin);
            } else if (i12 == 1) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintEdit);
            } else {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintCreate);
            }
            md1Var.f40538x.setMessageText(string);
            f2.x0 x0Var = new f2.x0(-1, -2);
            ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) x0Var).topMargin = AndroidUtilities.dp(23.0f);
            md1Var.f40538x.setLayoutParams(x0Var);
            k4Var = frameLayout;
        }
        return new f2.n1(k4Var);
    }
}
