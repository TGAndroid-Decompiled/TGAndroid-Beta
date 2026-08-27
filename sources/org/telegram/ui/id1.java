package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class id1 extends org.telegram.ui.Components.yk0 {

    public int f39061c;
    public int d;

    public int f39062e;

    public int f39063f;
    public int h;

    public int f39064n;

    public final ld1 f39065r;

    public id1(ld1 ld1Var) {
        this.f39065r = ld1Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.b() >= this.f39063f && o1Var.b() < this.h;
    }

    public final void E() {
        this.f39062e = -1;
        this.f39063f = -1;
        this.h = -1;
        this.f39064n = -1;
        this.f39061c = 2;
        this.d = 1;
        ArrayList arrayList = this.f39065r.f40059f;
        if (arrayList.isEmpty()) {
            return;
        }
        int i10 = this.f39061c;
        int i11 = i10 + 1;
        this.f39062e = i10;
        int i12 = i10 + 2;
        this.f39061c = i12;
        this.f39063f = i11;
        int size = (arrayList.size() - 1) + i12;
        this.h = size;
        this.f39061c = size + 1;
        this.f39064n = size;
    }

    @Override
    public final int h() {
        return this.f39061c;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == this.d) {
            return 2;
        }
        if (i10 == this.f39062e) {
            return 3;
        }
        return i10 == this.f39064n ? 5 : 4;
    }

    @Override
    public final void l() {
        E();
        super.l();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        View view = o1Var.f5789a;
        int i11 = this.f39062e;
        ld1 ld1Var = this.f39065r;
        if (i10 < i11 || i11 <= 0) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(ld1Var.A);
        }
        if (j(i10) == 4) {
            org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
            TLRPC.Chat chat = (TLRPC.Chat) ld1Var.f40059f.get(i10 - this.f39063f);
            d4Var.e(chat, chat.title, (String) ld1Var.h.get(i10 - this.f39063f), i10 != this.h - 1);
            d4Var.c(ld1Var.f40063w.contains(Long.valueOf(chat.f22380id)), false);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        String string;
        View view;
        View d4Var;
        if (i10 != 1) {
            if (i10 == 2) {
                View w6Var = new org.telegram.ui.Cells.w6(viewGroup.getContext(), (org.telegram.messenger.rl) null);
                org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false)), org.telegram.ui.ActionBar.g6.V0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23018b7));
                dqVar.f27828w = true;
                w6Var.setBackground(dqVar);
                d4Var = w6Var;
            } else if (i10 != 3) {
                d4Var = i10 != 5 ? new org.telegram.ui.Cells.d4(viewGroup.getContext(), 1, 0, false) : new org.telegram.ui.Cells.i3(viewGroup.getContext(), AndroidUtilities.dp(12.0f));
            } else {
                org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(viewGroup.getContext(), org.telegram.ui.ActionBar.g6.L6, 21, 8, false, null);
                j4Var.setHeight(54);
                j4Var.setText(LocaleController.getString(R.string.InactiveChats));
                view = j4Var;
            }
            view = d4Var;
        } else {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.ja jaVar = new org.telegram.ui.Cells.ja(context);
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.g6.f23218m9;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(context);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            jaVar.addView(textView, h7.z5.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            jaVar.f24546a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23111g9, false));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            jaVar.addView(textView2, h7.z5.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            hh.h1 h1Var = new hh.h1(context, new Paint(1), textPaint);
            h1Var.setWillNotDraw(false);
            h1Var.addView(imageView, h7.z5.e(-2, -2, 1));
            jaVar.addView(h1Var, h7.z5.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(LocaleController.getString(R.string.TooManyCommunities));
            imageView.setImageResource(R.drawable.groups_limit1);
            ld1 ld1Var = this.f39065r;
            ld1Var.f40064x = jaVar;
            int i12 = ld1Var.C;
            if (i12 == 0) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintJoin);
            } else {
                string = i12 == 1 ? LocaleController.getString(R.string.TooManyCommunitiesHintEdit) : LocaleController.getString(R.string.TooManyCommunitiesHintCreate);
            }
            ld1Var.f40064x.setMessageText(string);
            f2.y0 y0Var = new f2.y0(-1, -2);
            ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) y0Var).topMargin = AndroidUtilities.dp(23.0f);
            ld1Var.f40064x.setLayoutParams(y0Var);
            view = jaVar;
        }
        return new org.telegram.ui.Components.lk0(view);
    }
}
