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
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.y9;
public class u0 extends FrameLayout implements me.d {
    public final me.b f21537a;
    public fr f21538b;
    public final y9 f21539c;
    public final ImageView d;
    public final TextView f21540e;
    public gg.p0 f21541f;
    public final q h;
    public final e6 f21542n;
    public boolean f21543r;
    public boolean f21544s;
    public int v;
    public int f21545w;

    public u0(Context context, e6 e6Var) {
        super(context);
        this.f21537a = new me.b(0, this, hs.h, 380L, false);
        this.h = new q(this, 2);
        this.f21542n = e6Var;
        y9 y9Var = new y9(context);
        this.f21539c = y9Var;
        addView(y9Var, w7.x5.d(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, w7.x5.a(24.0f, 8.0f, 0.0f, 0.0f, 0.0f, 24, 16));
        TextView textView = new TextView(context);
        this.f21540e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.x5.a(-2.0f, 38.0f, 0.0f, 12.0f, 0.0f, -2, 16));
        this.f21545w = AndroidUtilities.dp(28.0f);
        a();
    }

    public final void a() {
        int w02;
        float f7 = this.f21537a.f16337e;
        boolean z10 = this.f21543r;
        e6 e6Var = this.f21542n;
        if (z10) {
            w02 = i6.m1(0.075f, i6.w0(i6.G6, e6Var));
        } else {
            w02 = i6.w0(i6.f20790ci, e6Var);
        }
        int i10 = i6.Oh;
        int w03 = i6.w0(i10, e6Var);
        int w04 = i6.w0(i6.G6, e6Var);
        int i11 = i6.Sh;
        int w05 = i6.w0(i11, e6Var);
        this.v = i0.a.d(f7, w02, w03);
        this.f21540e.setTextColor(i0.a.d(f7, w04, w05));
        ImageView imageView = this.d;
        imageView.setColorFilter(w05);
        imageView.setAlpha(f7);
        float f10 = 0.82f * f7;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        fr frVar = this.f21538b;
        if (frVar != null) {
            i6.w1(frVar, i6.w0(i10, e6Var), false);
            i6.w1(this.f21538b, i6.w0(i11, e6Var), true);
        }
        this.f21539c.setAlpha(1.0f - f7);
        gg.p0 p0Var = this.f21541f;
        if (p0Var != null && p0Var.d == 7) {
            setData(p0Var);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.f21545w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, i6.m0(this.v));
        super.dispatchDraw(canvas);
    }

    public gg.p0 getFilter() {
        return this.f21541f;
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
        if (this.f21544s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), Integer.MIN_VALUE), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setData(gg.p0 p0Var) {
        this.f21541f = p0Var;
        this.f21544s = false;
        String str = p0Var.f10762c;
        if (str == null) {
            str = LocaleController.getString(p0Var.f10761b);
        }
        this.f21540e.setText(str);
        fr M = i6.M(AndroidUtilities.dp(32.0f), p0Var.f10760a);
        this.f21538b = M;
        int i10 = i6.Oh;
        e6 e6Var = this.f21542n;
        i6.w1(M, i6.w0(i10, e6Var), false);
        fr frVar = this.f21538b;
        int i11 = i6.Sh;
        i6.w1(frVar, i6.w0(i11, e6Var), true);
        int i12 = p0Var.d;
        float f7 = 16.0f;
        y9 y9Var = this.f21539c;
        if (i12 == 4) {
            TLObject tLObject = p0Var.f10764f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f20185id == user.f20185id) {
                    fr M2 = i6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp = AndroidUtilities.dp(16.0f);
                    int dp2 = AndroidUtilities.dp(16.0f);
                    M2.f26466e = dp;
                    M2.f26467f = dp2;
                    i6.w1(M2, i6.w0(i10, e6Var), false);
                    i6.w1(M2, i6.w0(i11, e6Var), true);
                    y9Var.setImageDrawable(M2);
                    return;
                }
                y9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                y9Var.getImageReceiver().setForUserOrChat(user, this.f21538b);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f21544s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = y9Var.getImageReceiver();
                if (this.f21544s) {
                    f7 = 10.0f;
                }
                int dp3 = AndroidUtilities.dp(f7);
                this.f21545w = dp3;
                imageReceiver.setRoundRadius(dp3);
                y9Var.getImageReceiver().setForUserOrChat(chat, this.f21538b);
            }
        } else if (i12 == 7) {
            fr M3 = i6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp4 = AndroidUtilities.dp(16.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            M3.f26466e = dp4;
            M3.f26467f = dp5;
            i6.w1(M3, i6.w0(i10, e6Var), false);
            i6.w1(M3, i6.w0(i11, e6Var), true);
            y9Var.setImageDrawable(M3);
        } else {
            y9Var.setImageDrawable(this.f21538b);
        }
    }

    public void setExpanded(boolean z10) {
        TextView textView = this.f21540e;
        if (z10) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        setSelectedForDelete(false);
    }

    public void setSelectedForDelete(boolean z10) {
        me.b bVar = this.f21537a;
        if (bVar.f16338f != z10) {
            q qVar = this.h;
            AndroidUtilities.cancelRunOnUIThread(qVar);
            bVar.a(z10, true);
            if (z10) {
                AndroidUtilities.runOnUIThread(qVar, 2000L);
            }
        }
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
