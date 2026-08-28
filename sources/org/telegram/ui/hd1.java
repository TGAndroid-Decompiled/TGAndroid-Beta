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
public final class hd1 extends org.telegram.ui.Components.vk0 {
    public int f38755c;
    public int d;
    public int f38756e;
    public int f38757f;
    public int h;
    public int f38758n;
    public final kd1 f38759r;

    public hd1(kd1 kd1Var) {
        this.f38759r = kd1Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.b() >= this.f38757f && q1Var.b() < this.h) {
            return true;
        }
        return false;
    }

    public final void E() {
        this.f38756e = -1;
        this.f38757f = -1;
        this.h = -1;
        this.f38758n = -1;
        this.f38755c = 2;
        this.d = 1;
        ArrayList arrayList = this.f38759r.f39812f;
        if (!arrayList.isEmpty()) {
            int i9 = this.f38755c;
            int i10 = i9 + 1;
            this.f38756e = i9;
            int i11 = i9 + 2;
            this.f38755c = i11;
            this.f38757f = i10;
            int size = (arrayList.size() - 1) + i11;
            this.h = size;
            this.f38755c = size + 1;
            this.f38758n = size;
        }
    }

    @Override
    public final int h() {
        return this.f38755c;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == this.d) {
            return 2;
        }
        if (i9 == this.f38756e) {
            return 3;
        }
        if (i9 == this.f38758n) {
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
    public final void v(f2.q1 q1Var, int i9) {
        View view = q1Var.f5501a;
        int i10 = this.f38756e;
        kd1 kd1Var = this.f38759r;
        if (i9 >= i10 && i10 > 0) {
            view.setAlpha(kd1Var.A);
        } else {
            view.setAlpha(1.0f);
        }
        if (j(i9) == 4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            TLRPC.Chat chat = (TLRPC.Chat) kd1Var.f39812f.get(i9 - this.f38757f);
            String str = (String) kd1Var.h.get(i9 - this.f38757f);
            String str2 = chat.title;
            boolean z10 = true;
            if (i9 == this.h - 1) {
                z10 = false;
            }
            g4Var.e(chat, str2, str, z10);
            g4Var.c(kd1Var.f39816w.contains(Long.valueOf(chat.f22380id)), false);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        String string;
        org.telegram.ui.Cells.m4 m4Var;
        org.telegram.ui.Cells.g4 g4Var;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 5) {
                        g4Var = new org.telegram.ui.Cells.g4(viewGroup.getContext(), 1, 0, false);
                    } else {
                        g4Var = new org.telegram.ui.Cells.l3(viewGroup.getContext(), AndroidUtilities.dp(12.0f));
                    }
                } else {
                    org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(viewGroup.getContext(), org.telegram.ui.ActionBar.f6.L6, 21, 8, false, null);
                    m4Var2.setHeight(54);
                    m4Var2.setText(LocaleController.getString(R.string.InactiveChats));
                    m4Var = m4Var2;
                }
            } else {
                View z6Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.j2) null);
                org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false)), org.telegram.ui.ActionBar.f6.V0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.f6.f22966b7));
                fqVar.f28550w = true;
                z6Var.setBackground(fqVar);
                g4Var = z6Var;
            }
            m4Var = g4Var;
        } else {
            Context context = viewGroup.getContext();
            ?? frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            int i10 = org.telegram.ui.ActionBar.f6.f23165m9;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(context);
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            frameLayout.addView(textView, g7.e6.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f24780a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23058g9, false));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            frameLayout.addView(textView2, g7.e6.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            gh.h1 h1Var = new gh.h1(context, new Paint(1), textPaint);
            h1Var.setWillNotDraw(false);
            h1Var.addView(imageView, g7.e6.e(-2, -2, 1));
            frameLayout.addView(h1Var, g7.e6.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(LocaleController.getString(R.string.TooManyCommunities));
            imageView.setImageResource(R.drawable.groups_limit1);
            kd1 kd1Var = this.f38759r;
            kd1Var.f39817x = frameLayout;
            int i11 = kd1Var.C;
            if (i11 == 0) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintJoin);
            } else if (i11 == 1) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintEdit);
            } else {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintCreate);
            }
            kd1Var.f39817x.setMessageText(string);
            f2.a1 a1Var = new f2.a1(-1, -2);
            ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) a1Var).topMargin = AndroidUtilities.dp(23.0f);
            kd1Var.f39817x.setLayoutParams(a1Var);
            m4Var = frameLayout;
        }
        return new f2.q1(m4Var);
    }
}
