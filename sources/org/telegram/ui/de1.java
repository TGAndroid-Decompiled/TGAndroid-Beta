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
public final class de1 extends org.telegram.ui.Components.ql0 {
    public int f33451c;
    public int d;
    public int e;
    public int f33452f;
    public int h;
    public int f33453n;
    public final ge1 f33454r;

    public de1(ge1 ge1Var) {
        this.f33454r = ge1Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.b() >= this.f33452f && l1Var.b() < this.h) {
            return true;
        }
        return false;
    }

    public final void E() {
        this.e = -1;
        this.f33452f = -1;
        this.h = -1;
        this.f33453n = -1;
        this.f33451c = 2;
        this.d = 1;
        ArrayList arrayList = this.f33454r.f34430f;
        if (!arrayList.isEmpty()) {
            int i10 = this.f33451c;
            int i11 = i10 + 1;
            this.e = i10;
            int i12 = i10 + 2;
            this.f33451c = i12;
            this.f33452f = i11;
            int size = (arrayList.size() - 1) + i12;
            this.h = size;
            this.f33451c = size + 1;
            this.f33453n = size;
        }
    }

    @Override
    public final int h() {
        return this.f33451c;
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
        if (i10 == this.f33453n) {
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
    public final void v(f2.l1 l1Var, int i10) {
        View view = l1Var.f5774a;
        int i11 = this.e;
        ge1 ge1Var = this.f33454r;
        if (i10 >= i11 && i11 > 0) {
            view.setAlpha(ge1Var.B);
        } else {
            view.setAlpha(1.0f);
        }
        if (j(i10) == 4) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            TLRPC.Chat chat = (TLRPC.Chat) ge1Var.f34430f.get(i10 - this.f33452f);
            String str = (String) ge1Var.h.get(i10 - this.f33452f);
            String str2 = chat.title;
            boolean z4 = true;
            if (i10 == this.h - 1) {
                z4 = false;
            }
            f4Var.e(chat, str2, str, z4);
            f4Var.c(ge1Var.f34434w.contains(Long.valueOf(chat.f19159id)), false);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
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
                    org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(viewGroup.getContext(), org.telegram.ui.ActionBar.j6.L6, 21, 8, false, null);
                    l4Var2.setHeight(54);
                    l4Var2.setText(LocaleController.getString(R.string.InactiveChats));
                    l4Var = l4Var2;
                }
            } else {
                View y6Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (b) null);
                org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false)), org.telegram.ui.ActionBar.j6.V0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f19846b7));
                mqVar.f27116w = true;
                y6Var.setBackground(mqVar);
                f4Var = y6Var;
            }
            l4Var = f4Var;
        } else {
            Context context = viewGroup.getContext();
            ?? frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.j6.m9;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(context);
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            frameLayout.addView(textView, k7.b6.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f21337a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19938g9, false));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            frameLayout.addView(textView2, k7.b6.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            dg.v3 v3Var = new dg.v3(context, new Paint(1), textPaint);
            v3Var.setWillNotDraw(false);
            v3Var.addView(imageView, k7.b6.e(-2, -2, 1));
            frameLayout.addView(v3Var, k7.b6.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(LocaleController.getString(R.string.TooManyCommunities));
            imageView.setImageResource(R.drawable.groups_limit1);
            ge1 ge1Var = this.f33454r;
            ge1Var.f34435x = frameLayout;
            int i12 = ge1Var.D;
            if (i12 == 0) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintJoin);
            } else if (i12 == 1) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintEdit);
            } else {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintCreate);
            }
            ge1Var.f34435x.setMessageText(string);
            f2.w0 w0Var = new f2.w0(-1, -2);
            ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) w0Var).topMargin = AndroidUtilities.dp(23.0f);
            ge1Var.f34435x.setLayoutParams(w0Var);
            l4Var = frameLayout;
        }
        return new f2.l1(l4Var);
    }
}
