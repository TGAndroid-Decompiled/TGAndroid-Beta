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
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.z9;
public class t0 extends FrameLayout implements ne.d {
    public final ne.b f20633a;
    public cr f20634b;
    public final z9 f20635c;
    public final ImageView d;
    public final TextView e;
    public hg.p0 f20636f;
    public final p h;
    public final c6 f20637n;
    public boolean f20638r;
    public boolean f20639s;
    public int v;
    public int f20640w;

    public t0(Context context, c6 c6Var) {
        super(context);
        this.f20633a = new ne.b(0, this, es.h, 380L, false);
        this.h = new p(this, 2);
        this.f20637n = c6Var;
        z9 z9Var = new z9(context);
        this.f20635c = z9Var;
        addView(z9Var, w7.a6.d(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, w7.a6.a(24.0f, 8.0f, 0.0f, 0.0f, 0.0f, 24, 16));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.a6.a(-2.0f, 38.0f, 0.0f, 12.0f, 0.0f, -2, 16));
        this.f20640w = AndroidUtilities.dp(28.0f);
        a();
    }

    public final void a() {
        int w02;
        float f7 = this.f20633a.e;
        boolean z10 = this.f20638r;
        c6 c6Var = this.f20637n;
        if (z10) {
            w02 = g6.m1(0.075f, g6.w0(g6.G6, c6Var));
        } else {
            w02 = g6.w0(g6.f19894ci, c6Var);
        }
        int i10 = g6.Oh;
        int w03 = g6.w0(i10, c6Var);
        int w04 = g6.w0(g6.G6, c6Var);
        int i11 = g6.Sh;
        int w05 = g6.w0(i11, c6Var);
        this.v = i0.a.d(f7, w02, w03);
        this.e.setTextColor(i0.a.d(f7, w04, w05));
        ImageView imageView = this.d;
        imageView.setColorFilter(w05);
        imageView.setAlpha(f7);
        float f10 = 0.82f * f7;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        cr crVar = this.f20634b;
        if (crVar != null) {
            g6.w1(crVar, g6.w0(i10, c6Var), false);
            g6.w1(this.f20634b, g6.w0(i11, c6Var), true);
        }
        this.f20635c.setAlpha(1.0f - f7);
        hg.p0 p0Var = this.f20636f;
        if (p0Var != null && p0Var.d == 7) {
            setData(p0Var);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.f20640w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, g6.m0(this.v));
        super.dispatchDraw(canvas);
    }

    public hg.p0 getFilter() {
        return this.f20636f;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.f20639s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), Integer.MIN_VALUE), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            a();
            invalidate();
        }
    }

    public void setData(hg.p0 p0Var) {
        this.f20636f = p0Var;
        this.f20639s = false;
        String str = p0Var.f10701c;
        if (str == null) {
            str = LocaleController.getString(p0Var.f10700b);
        }
        this.e.setText(str);
        cr M = g6.M(AndroidUtilities.dp(32.0f), p0Var.f10699a);
        this.f20634b = M;
        int i10 = g6.Oh;
        c6 c6Var = this.f20637n;
        g6.w1(M, g6.w0(i10, c6Var), false);
        cr crVar = this.f20634b;
        int i11 = g6.Sh;
        g6.w1(crVar, g6.w0(i11, c6Var), true);
        int i12 = p0Var.d;
        float f7 = 16.0f;
        z9 z9Var = this.f20635c;
        if (i12 == 4) {
            TLObject tLObject = p0Var.f10702f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f19363id == user.f19363id) {
                    cr M2 = g6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp = AndroidUtilities.dp(16.0f);
                    int dp2 = AndroidUtilities.dp(16.0f);
                    M2.e = dp;
                    M2.f24194f = dp2;
                    g6.w1(M2, g6.w0(i10, c6Var), false);
                    g6.w1(M2, g6.w0(i11, c6Var), true);
                    z9Var.setImageDrawable(M2);
                    return;
                }
                z9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                z9Var.getImageReceiver().setForUserOrChat(user, this.f20634b);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f20639s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = z9Var.getImageReceiver();
                if (this.f20639s) {
                    f7 = 10.0f;
                }
                int dp3 = AndroidUtilities.dp(f7);
                this.f20640w = dp3;
                imageReceiver.setRoundRadius(dp3);
                z9Var.getImageReceiver().setForUserOrChat(chat, this.f20634b);
            }
        } else if (i12 == 7) {
            cr M3 = g6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp4 = AndroidUtilities.dp(16.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            M3.e = dp4;
            M3.f24194f = dp5;
            g6.w1(M3, g6.w0(i10, c6Var), false);
            g6.w1(M3, g6.w0(i11, c6Var), true);
            z9Var.setImageDrawable(M3);
        } else {
            z9Var.setImageDrawable(this.f20634b);
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
        ne.b bVar = this.f20633a;
        if (bVar.f16293f != z10) {
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
