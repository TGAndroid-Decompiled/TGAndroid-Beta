package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.n9;

public class u0 extends FrameLayout implements ud.b {

    public final ud.a f23813a;

    public dq f23814b;

    public final n9 f23815c;
    public final ImageView d;

    public final TextView f23816e;

    public pf.e0 f23817f;
    public final p h;

    public final c6 f23818n;

    public boolean f23819r;

    public boolean f23820s;
    public int v;

    public int f23821w;

    public u0(Context context, c6 c6Var) {
        super(context);
        this.f23813a = new ud.a(0, this, er.h, 380L, false);
        this.h = new p(this, 2);
        this.f23818n = c6Var;
        n9 n9Var = new n9(context);
        this.f23815c = n9Var;
        addView(n9Var, h7.z5.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, h7.z5.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f23816e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, h7.z5.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f23821w = AndroidUtilities.dp(28.0f);
        a();
    }

    public final void a() {
        float f10 = this.f23813a.f48497e;
        boolean z10 = this.f23819r;
        c6 c6Var = this.f23818n;
        int iL1 = z10 ? g6.l1(0.075f, g6.v0(g6.G6, c6Var)) : g6.v0(g6.ci, c6Var);
        int i10 = g6.Oh;
        int iV0 = g6.v0(i10, c6Var);
        int iV1 = g6.v0(g6.G6, c6Var);
        int i11 = g6.Sh;
        int iV2 = g6.v0(i11, c6Var);
        this.v = i0.b.d(f10, iL1, iV0);
        this.f23816e.setTextColor(i0.b.d(f10, iV1, iV2));
        ImageView imageView = this.d;
        imageView.setColorFilter(iV2);
        imageView.setAlpha(f10);
        float f11 = 0.82f * f10;
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        dq dqVar = this.f23814b;
        if (dqVar != null) {
            g6.v1(dqVar, g6.v0(i10, c6Var), false);
            g6.v1(this.f23814b, g6.v0(i11, c6Var), true);
        }
        this.f23815c.setAlpha(1.0f - f10);
        pf.e0 e0Var = this.f23817f;
        if (e0Var != null && e0Var.d == 7) {
            setData(e0Var);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.f23821w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, g6.l0(this.v));
        super.dispatchDraw(canvas);
    }

    public pf.e0 getFilter() {
        return this.f23817f;
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 0) {
            a();
            invalidate();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.f23820s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), Integer.MIN_VALUE), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setData(pf.e0 e0Var) {
        this.f23817f = e0Var;
        this.f23820s = false;
        String string = e0Var.f45781c;
        if (string == null) {
            string = LocaleController.getString(e0Var.f45780b);
        }
        this.f23816e.setText(string);
        dq dqVarL = g6.L(AndroidUtilities.dp(32.0f), e0Var.f45779a);
        this.f23814b = dqVarL;
        int i10 = g6.Oh;
        c6 c6Var = this.f23818n;
        g6.v1(dqVarL, g6.v0(i10, c6Var), false);
        dq dqVar = this.f23814b;
        int i11 = g6.Sh;
        g6.v1(dqVar, g6.v0(i11, c6Var), true);
        int i12 = e0Var.d;
        n9 n9Var = this.f23815c;
        if (i12 != 4) {
            if (i12 != 7) {
                n9Var.setImageDrawable(this.f23814b);
                return;
            }
            dq dqVarL2 = g6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int iDp = AndroidUtilities.dp(16.0f);
            int iDp2 = AndroidUtilities.dp(16.0f);
            dqVarL2.f27823e = iDp;
            dqVarL2.f27824f = iDp2;
            g6.v1(dqVarL2, g6.v0(i10, c6Var), false);
            g6.v1(dqVarL2, g6.v0(i11, c6Var), true);
            n9Var.setImageDrawable(dqVarL2);
            return;
        }
        TLObject tLObject = e0Var.f45783f;
        if (!(tLObject instanceof TLRPC.User)) {
            if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f23820s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = n9Var.getImageReceiver();
                int iDp3 = AndroidUtilities.dp(this.f23820s ? 10.0f : 16.0f);
                this.f23821w = iDp3;
                imageReceiver.setRoundRadius(iDp3);
                n9Var.getImageReceiver().setForUserOrChat(chat, this.f23814b);
                return;
            }
            return;
        }
        TLRPC.User user = (TLRPC.User) tLObject;
        if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f22527id != user.f22527id) {
            n9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
            n9Var.getImageReceiver().setForUserOrChat(user, this.f23814b);
            return;
        }
        dq dqVarL3 = g6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
        int iDp4 = AndroidUtilities.dp(16.0f);
        int iDp5 = AndroidUtilities.dp(16.0f);
        dqVarL3.f27823e = iDp4;
        dqVarL3.f27824f = iDp5;
        g6.v1(dqVarL3, g6.v0(i10, c6Var), false);
        g6.v1(dqVarL3, g6.v0(i11, c6Var), true);
        n9Var.setImageDrawable(dqVarL3);
    }

    public void setExpanded(boolean z10) {
        TextView textView = this.f23816e;
        if (z10) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            setSelectedForDelete(false);
        }
    }

    public void setSelectedForDelete(boolean z10) {
        ud.a aVar = this.f23813a;
        if (aVar.f48498f == z10) {
            return;
        }
        p pVar = this.h;
        AndroidUtilities.cancelRunOnUIThread(pVar);
        aVar.a(z10, true);
        if (z10) {
            AndroidUtilities.runOnUIThread(pVar, 2000L);
        }
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
