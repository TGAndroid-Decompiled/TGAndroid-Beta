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
public final class ee1 extends org.telegram.ui.Components.rl0 {
    public int f36466c;
    public int d;
    public int f36467e;
    public int f36468f;
    public int h;
    public int f36469n;
    public final he1 f36470r;

    public ee1(he1 he1Var) {
        this.f36470r = he1Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.b() >= this.f36468f && m1Var.b() < this.h) {
            return true;
        }
        return false;
    }

    public final void E() {
        this.f36467e = -1;
        this.f36468f = -1;
        this.h = -1;
        this.f36469n = -1;
        this.f36466c = 2;
        this.d = 1;
        ArrayList arrayList = this.f36470r.f37358f;
        if (!arrayList.isEmpty()) {
            int i10 = this.f36466c;
            int i11 = i10 + 1;
            this.f36467e = i10;
            int i12 = i10 + 2;
            this.f36466c = i12;
            this.f36468f = i11;
            int size = (arrayList.size() - 1) + i12;
            this.h = size;
            this.f36466c = size + 1;
            this.f36469n = size;
        }
    }

    @Override
    public final int h() {
        return this.f36466c;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == this.d) {
            return 2;
        }
        if (i10 == this.f36467e) {
            return 3;
        }
        if (i10 == this.f36469n) {
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
    public final void v(f2.m1 m1Var, int i10) {
        View view = m1Var.f5875a;
        int i11 = this.f36467e;
        he1 he1Var = this.f36470r;
        if (i10 >= i11 && i11 > 0) {
            view.setAlpha(he1Var.B);
        } else {
            view.setAlpha(1.0f);
        }
        if (j(i10) == 4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            TLRPC.Chat chat = (TLRPC.Chat) he1Var.f37358f.get(i10 - this.f36468f);
            String str = (String) he1Var.h.get(i10 - this.f36468f);
            String str2 = chat.title;
            boolean z4 = true;
            if (i10 == this.h - 1) {
                z4 = false;
            }
            g4Var.e(chat, str2, str, z4);
            g4Var.c(he1Var.f37362w.contains(Long.valueOf(chat.f20845id)), false);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        String string;
        org.telegram.ui.Cells.m4 m4Var;
        org.telegram.ui.Cells.g4 g4Var;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        g4Var = new org.telegram.ui.Cells.g4(viewGroup.getContext(), 1, 0, false);
                    } else {
                        g4Var = new org.telegram.ui.Cells.k3(viewGroup.getContext(), AndroidUtilities.dp(12.0f));
                    }
                } else {
                    org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(viewGroup.getContext(), org.telegram.ui.ActionBar.k6.L6, 21, 8, false, null);
                    m4Var2.setHeight(54);
                    m4Var2.setText(LocaleController.getString(R.string.InactiveChats));
                    m4Var = m4Var2;
                }
            } else {
                View z6Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (b) null);
                org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false)), org.telegram.ui.ActionBar.k6.V0(viewGroup.getContext(), R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21626b7));
                pqVar.f30166w = true;
                z6Var.setBackground(pqVar);
                g4Var = z6Var;
            }
            m4Var = g4Var;
        } else {
            Context context = viewGroup.getContext();
            ?? frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            int i11 = org.telegram.ui.ActionBar.k6.m9;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = new TextView(context);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            frameLayout.addView(textView, k7.c6.d(-1, -2.0f, 51, 52.0f, 75.0f, 52.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f23183a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21719g9, false));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            frameLayout.addView(textView2, k7.c6.d(-1, -2.0f, 51, 36.0f, 110.0f, 36.0f, 0.0f));
            TextPaint textPaint = new TextPaint(1);
            textPaint.setColor(-1);
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            eg.t3 t3Var = new eg.t3(context, new Paint(1), textPaint);
            t3Var.setWillNotDraw(false);
            t3Var.addView(imageView, k7.c6.e(-2, -2, 1));
            frameLayout.addView(t3Var, k7.c6.d(-2, -2.0f, 49, 0.0f, 12.0f, 0.0f, 6.0f));
            textView.setText(LocaleController.getString(R.string.TooManyCommunities));
            imageView.setImageResource(R.drawable.groups_limit1);
            he1 he1Var = this.f36470r;
            he1Var.f37363x = frameLayout;
            int i12 = he1Var.D;
            if (i12 == 0) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintJoin);
            } else if (i12 == 1) {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintEdit);
            } else {
                string = LocaleController.getString(R.string.TooManyCommunitiesHintCreate);
            }
            he1Var.f37363x.setMessageText(string);
            f2.x0 x0Var = new f2.x0(-1, -2);
            ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin = AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) x0Var).topMargin = AndroidUtilities.dp(23.0f);
            he1Var.f37363x.setLayoutParams(x0Var);
            m4Var = frameLayout;
        }
        return new f2.m1(m4Var);
    }
}
