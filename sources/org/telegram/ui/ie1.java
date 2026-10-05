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
public final class ie1 extends org.telegram.ui.Components.yl0 {
    public int f37400c;
    public int d;
    public int f37401e;
    public int f37402f;
    public int h;
    public int f37403n;
    public final le1 f37404r;

    public ie1(le1 le1Var) {
        this.f37404r = le1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.b() >= this.f37402f && c1Var.b() < this.h) {
            return true;
        }
        return false;
    }

    public final void E() {
        this.f37401e = -1;
        this.f37402f = -1;
        this.h = -1;
        this.f37403n = -1;
        this.f37400c = 2;
        this.d = 1;
        ArrayList arrayList = this.f37404r.f38301f;
        if (!arrayList.isEmpty()) {
            int i10 = this.f37400c;
            int i11 = i10 + 1;
            this.f37401e = i10;
            int i12 = i10 + 2;
            this.f37400c = i12;
            this.f37402f = i11;
            int size = (arrayList.size() - 1) + i12;
            this.h = size;
            this.f37400c = size + 1;
            this.f37403n = size;
        }
    }

    @Override
    public final int h() {
        return this.f37400c;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == this.d) {
            return 2;
        }
        if (i10 == this.f37401e) {
            return 3;
        }
        if (i10 == this.f37403n) {
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
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.f46538a;
        int i11 = this.f37401e;
        le1 le1Var = this.f37404r;
        if (i10 >= i11 && i11 > 0) {
            view.setAlpha(le1Var.E);
        } else {
            view.setAlpha(1.0f);
        }
        if (j(i10) == 4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            TLRPC.Chat chat = (TLRPC.Chat) le1Var.f38301f.get(i10 - this.f37402f);
            String str = (String) le1Var.h.get(i10 - this.f37402f);
            String str2 = chat.title;
            boolean z10 = true;
            if (i10 == this.h - 1) {
                z10 = false;
            }
            g4Var.e(chat, str2, str, z10);
            g4Var.c(le1Var.f38305w.contains(Long.valueOf(chat.f20047id)), false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        String string;
        org.telegram.ui.Cells.m4 m4Var;
        org.telegram.ui.Cells.g4 g4Var;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        g4Var = new org.telegram.ui.Cells.g4(viewGroup.getContext(), 1, 0, false);
                    } else {
                        g4Var = new org.telegram.ui.Cells.l3(viewGroup.getContext(), AndroidUtilities.dp(12.0f));
                    }
                } else {
                    org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(viewGroup.getContext(), org.telegram.ui.ActionBar.i6.L6, 21, 8, false, null);
                    m4Var2.setHeight(54);
                    m4Var2.setText(LocaleController.getString(R.string.InactiveChats));
                    m4Var = m4Var2;
                }
            } else {
                View b7Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
                org.telegram.ui.Components.sq sqVar = new org.telegram.ui.Components.sq(new ColorDrawable(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20771a7, false)), org.telegram.ui.ActionBar.i6.V0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.i6.f20791b7));
                sqVar.f30931w = true;
                b7Var.setBackground(sqVar);
                g4Var = b7Var;
            }
            m4Var = g4Var;
        } else {
            Context context = viewGroup.getContext();
            ?? frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.i6.f20996m9;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(context);
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f22708a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20885g9, false));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            frameLayout.addView(textView2, w7.z5.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            ai.w7 w7Var = new ai.w7(context, new Paint(1), textPaint);
            w7Var.setWillNotDraw(false);
            w7Var.addView(imageView, w7.z5.e(-2, -2, 1));
            frameLayout.addView(w7Var, w7.z5.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(LocaleController.getString(R.string.TooManyCommunities));
            imageView.setImageResource(R.drawable.groups_limit1);
            le1 le1Var = this.f37404r;
            le1Var.f38306x = frameLayout;
            int i12 = le1Var.G;
            if (i12 == 0) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintJoin);
            } else if (i12 == 1) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintEdit);
            } else {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintCreate);
            }
            le1Var.f38306x.setMessageText(string);
            s4.p0 p0Var = new s4.p0(-1, -2);
            ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) p0Var).topMargin = AndroidUtilities.dp(23.0f);
            le1Var.f38306x.setLayoutParams(p0Var);
            m4Var = frameLayout;
        }
        return new s4.c1(m4Var);
    }
}
