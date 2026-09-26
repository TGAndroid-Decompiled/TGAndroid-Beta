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
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.w9;
public class t0 extends FrameLayout implements le.e {
    public final le.c f19746a;
    public qq f19747b;
    public final w9 f19748c;
    public final ImageView d;
    public final TextView e;
    public gg.q0 f19749f;
    public final p h;
    public final d6 f19750n;
    public boolean f19751r;
    public boolean f19752s;
    public int v;
    public int f19753w;

    public t0(Context context, d6 d6Var) {
        super(context);
        this.f19746a = new le.c(0, this, rr.h, 380L, false);
        this.h = new p(this, 2);
        this.f19750n = d6Var;
        w9 w9Var = new w9(context);
        this.f19748c = w9Var;
        addView(w9Var, w7.y5.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, w7.y5.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.y5.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f19753w = AndroidUtilities.dp(28.0f);
        a();
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        if (i10 == 0) {
            a();
            invalidate();
        }
    }

    public final void a() {
        int v02;
        float f7 = this.f19746a.e;
        boolean z10 = this.f19751r;
        d6 d6Var = this.f19750n;
        if (z10) {
            v02 = h6.l1(0.075f, h6.v0(h6.G6, d6Var));
        } else {
            v02 = h6.v0(h6.f19052ci, d6Var);
        }
        int i10 = h6.Oh;
        int v03 = h6.v0(i10, d6Var);
        int v04 = h6.v0(h6.G6, d6Var);
        int i11 = h6.Sh;
        int v05 = h6.v0(i11, d6Var);
        this.v = i0.a.d(f7, v02, v03);
        this.e.setTextColor(i0.a.d(f7, v04, v05));
        ImageView imageView = this.d;
        imageView.setColorFilter(v05);
        imageView.setAlpha(f7);
        float f10 = 0.82f * f7;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        qq qqVar = this.f19747b;
        if (qqVar != null) {
            h6.v1(qqVar, h6.v0(i10, d6Var), false);
            h6.v1(this.f19747b, h6.v0(i11, d6Var), true);
        }
        this.f19748c.setAlpha(1.0f - f7);
        gg.q0 q0Var = this.f19749f;
        if (q0Var != null && q0Var.d == 7) {
            setData(q0Var);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.f19753w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, h6.l0(this.v));
        super.dispatchDraw(canvas);
    }

    public gg.q0 getFilter() {
        return this.f19749f;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.f19752s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), Integer.MIN_VALUE), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setData(gg.q0 q0Var) {
        this.f19749f = q0Var;
        this.f19752s = false;
        String str = q0Var.f9880c;
        if (str == null) {
            str = LocaleController.getString(q0Var.f9879b);
        }
        this.e.setText(str);
        qq L = h6.L(AndroidUtilities.dp(32.0f), q0Var.f9878a);
        this.f19747b = L;
        int i10 = h6.Oh;
        d6 d6Var = this.f19750n;
        h6.v1(L, h6.v0(i10, d6Var), false);
        qq qqVar = this.f19747b;
        int i11 = h6.Sh;
        h6.v1(qqVar, h6.v0(i11, d6Var), true);
        int i12 = q0Var.d;
        float f7 = 16.0f;
        w9 w9Var = this.f19748c;
        if (i12 == 4) {
            TLObject tLObject = q0Var.f9881f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f18482id == user.f18482id) {
                    qq L2 = h6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp = AndroidUtilities.dp(16.0f);
                    int dp2 = AndroidUtilities.dp(16.0f);
                    L2.e = dp;
                    L2.f27735f = dp2;
                    h6.v1(L2, h6.v0(i10, d6Var), false);
                    h6.v1(L2, h6.v0(i11, d6Var), true);
                    w9Var.setImageDrawable(L2);
                    return;
                }
                w9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                w9Var.getImageReceiver().setForUserOrChat(user, this.f19747b);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f19752s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                if (this.f19752s) {
                    f7 = 10.0f;
                }
                int dp3 = AndroidUtilities.dp(f7);
                this.f19753w = dp3;
                imageReceiver.setRoundRadius(dp3);
                w9Var.getImageReceiver().setForUserOrChat(chat, this.f19747b);
            }
        } else if (i12 == 7) {
            qq L3 = h6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp4 = AndroidUtilities.dp(16.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            L3.e = dp4;
            L3.f27735f = dp5;
            h6.v1(L3, h6.v0(i10, d6Var), false);
            h6.v1(L3, h6.v0(i11, d6Var), true);
            w9Var.setImageDrawable(L3);
        } else {
            w9Var.setImageDrawable(this.f19747b);
        }
    }

    public void setExpanded(boolean z10) {
        TextView textView = this.e;
        if (z10) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        setSelectedForDelete(false);
    }

    public void setSelectedForDelete(boolean z10) {
        le.c cVar = this.f19746a;
        if (cVar.f14201f != z10) {
            p pVar = this.h;
            AndroidUtilities.cancelRunOnUIThread(pVar);
            cVar.a(z10, true);
            if (z10) {
                AndroidUtilities.runOnUIThread(pVar, 2000L);
            }
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
