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
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.y9;
public class t0 extends FrameLayout implements me.d {
    public final me.b f21263a;
    public hr f21264b;
    public final y9 f21265c;
    public final ImageView d;
    public final TextView f21266e;
    public gg.p0 f21267f;
    public final p h;
    public final c6 f21268n;
    public boolean f21269r;
    public boolean f21270s;
    public int v;
    public int f21271w;

    public t0(Context context, c6 c6Var) {
        super(context);
        this.f21263a = new me.b(0, this, js.h, 380L, false);
        this.h = new p(this, 2);
        this.f21268n = c6Var;
        y9 y9Var = new y9(context);
        this.f21265c = y9Var;
        addView(y9Var, w7.w5.d(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, w7.w5.a(24.0f, 8.0f, 0.0f, 0.0f, 0.0f, 24, 16));
        TextView textView = new TextView(context);
        this.f21266e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.w5.a(-2.0f, 38.0f, 0.0f, 12.0f, 0.0f, -2, 16));
        this.f21271w = AndroidUtilities.dp(28.0f);
        a();
    }

    public final void a() {
        int w02;
        float f7 = this.f21263a.f16087e;
        boolean z10 = this.f21269r;
        c6 c6Var = this.f21268n;
        if (z10) {
            w02 = h6.m1(0.075f, h6.w0(h6.G6, c6Var));
        } else {
            w02 = h6.w0(h6.f20552ci, c6Var);
        }
        int i10 = h6.Oh;
        int w03 = h6.w0(i10, c6Var);
        int w04 = h6.w0(h6.G6, c6Var);
        int i11 = h6.Sh;
        int w05 = h6.w0(i11, c6Var);
        this.v = i0.a.d(f7, w02, w03);
        this.f21266e.setTextColor(i0.a.d(f7, w04, w05));
        ImageView imageView = this.d;
        imageView.setColorFilter(w05);
        imageView.setAlpha(f7);
        float f10 = 0.82f * f7;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        hr hrVar = this.f21264b;
        if (hrVar != null) {
            h6.w1(hrVar, h6.w0(i10, c6Var), false);
            h6.w1(this.f21264b, h6.w0(i11, c6Var), true);
        }
        this.f21265c.setAlpha(1.0f - f7);
        gg.p0 p0Var = this.f21267f;
        if (p0Var != null && p0Var.d == 7) {
            setData(p0Var);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.f21271w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, h6.m0(this.v));
        super.dispatchDraw(canvas);
    }

    public gg.p0 getFilter() {
        return this.f21267f;
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 0) {
            a();
            invalidate();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.f21270s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), Integer.MIN_VALUE), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setData(gg.p0 p0Var) {
        this.f21267f = p0Var;
        this.f21270s = false;
        String str = p0Var.f10760c;
        if (str == null) {
            str = LocaleController.getString(p0Var.f10759b);
        }
        this.f21266e.setText(str);
        hr M = h6.M(AndroidUtilities.dp(32.0f), p0Var.f10758a);
        this.f21264b = M;
        int i10 = h6.Oh;
        c6 c6Var = this.f21268n;
        h6.w1(M, h6.w0(i10, c6Var), false);
        hr hrVar = this.f21264b;
        int i11 = h6.Sh;
        h6.w1(hrVar, h6.w0(i11, c6Var), true);
        int i12 = p0Var.d;
        float f7 = 16.0f;
        y9 y9Var = this.f21265c;
        if (i12 == 4) {
            TLObject tLObject = p0Var.f10762f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f19949id == user.f19949id) {
                    hr M2 = h6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp = AndroidUtilities.dp(16.0f);
                    int dp2 = AndroidUtilities.dp(16.0f);
                    M2.f26892e = dp;
                    M2.f26893f = dp2;
                    h6.w1(M2, h6.w0(i10, c6Var), false);
                    h6.w1(M2, h6.w0(i11, c6Var), true);
                    y9Var.setImageDrawable(M2);
                    return;
                }
                y9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                y9Var.getImageReceiver().setForUserOrChat(user, this.f21264b);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f21270s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = y9Var.getImageReceiver();
                if (this.f21270s) {
                    f7 = 10.0f;
                }
                int dp3 = AndroidUtilities.dp(f7);
                this.f21271w = dp3;
                imageReceiver.setRoundRadius(dp3);
                y9Var.getImageReceiver().setForUserOrChat(chat, this.f21264b);
            }
        } else if (i12 == 7) {
            hr M3 = h6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp4 = AndroidUtilities.dp(16.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            M3.f26892e = dp4;
            M3.f26893f = dp5;
            h6.w1(M3, h6.w0(i10, c6Var), false);
            h6.w1(M3, h6.w0(i11, c6Var), true);
            y9Var.setImageDrawable(M3);
        } else {
            y9Var.setImageDrawable(this.f21264b);
        }
    }

    public void setExpanded(boolean z10) {
        TextView textView = this.f21266e;
        if (z10) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        setSelectedForDelete(false);
    }

    public void setSelectedForDelete(boolean z10) {
        me.b bVar = this.f21263a;
        if (bVar.f16088f != z10) {
            p pVar = this.h;
            AndroidUtilities.cancelRunOnUIThread(pVar);
            bVar.a(z10, true);
            if (z10) {
                AndroidUtilities.runOnUIThread(pVar, 2000L);
            }
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
