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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.zq;
public class t0 extends FrameLayout implements ne.d {
    public final ne.b f21718a;
    public zq f21719b;
    public final w9 f21720c;
    public final ImageView d;
    public final TextView e;
    public hg.o0 f21721f;
    public final p h;
    public final d6 f21722n;
    public boolean f21723r;
    public boolean f21724s;
    public int v;
    public int f21725w;

    public t0(Context context, d6 d6Var) {
        super(context);
        this.f21718a = new ne.b(0, this, bs.h, 380L, false);
        this.h = new p(this, 2);
        this.f21722n = d6Var;
        w9 w9Var = new w9(context);
        this.f21720c = w9Var;
        addView(w9Var, w7.z5.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, w7.z5.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.z5.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f21725w = AndroidUtilities.dp(28.0f);
        a();
    }

    public final void a() {
        int w02;
        float f7 = this.f21718a.e;
        boolean z10 = this.f21723r;
        d6 d6Var = this.f21722n;
        if (z10) {
            w02 = h6.m1(0.075f, h6.w0(h6.G6, d6Var));
        } else {
            w02 = h6.w0(h6.f20986ci, d6Var);
        }
        int i10 = h6.Oh;
        int w03 = h6.w0(i10, d6Var);
        int w04 = h6.w0(h6.G6, d6Var);
        int i11 = h6.Sh;
        int w05 = h6.w0(i11, d6Var);
        this.v = i0.a.f(f7, w02, w03);
        this.e.setTextColor(i0.a.f(f7, w04, w05));
        ImageView imageView = this.d;
        imageView.setColorFilter(w05);
        imageView.setAlpha(f7);
        float f10 = 0.82f * f7;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        zq zqVar = this.f21719b;
        if (zqVar != null) {
            h6.w1(zqVar, h6.w0(i10, d6Var), false);
            h6.w1(this.f21719b, h6.w0(i11, d6Var), true);
        }
        this.f21720c.setAlpha(1.0f - f7);
        hg.o0 o0Var = this.f21721f;
        if (o0Var != null && o0Var.d == 7) {
            setData(o0Var);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.f21725w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, h6.m0(this.v));
        super.dispatchDraw(canvas);
    }

    public hg.o0 getFilter() {
        return this.f21721f;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.f21724s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), Integer.MIN_VALUE), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            a();
            invalidate();
        }
    }

    public void setData(hg.o0 o0Var) {
        this.f21721f = o0Var;
        this.f21724s = false;
        String str = o0Var.f12003c;
        if (str == null) {
            str = LocaleController.getString(o0Var.f12002b);
        }
        this.e.setText(str);
        zq M = h6.M(AndroidUtilities.dp(32.0f), o0Var.f12001a);
        this.f21719b = M;
        int i10 = h6.Oh;
        d6 d6Var = this.f21722n;
        h6.w1(M, h6.w0(i10, d6Var), false);
        zq zqVar = this.f21719b;
        int i11 = h6.Sh;
        h6.w1(zqVar, h6.w0(i11, d6Var), true);
        int i12 = o0Var.d;
        float f7 = 16.0f;
        w9 w9Var = this.f21720c;
        if (i12 == 4) {
            TLObject tLObject = o0Var.f12004f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f20426id == user.f20426id) {
                    zq M2 = h6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp = AndroidUtilities.dp(16.0f);
                    int dp2 = AndroidUtilities.dp(16.0f);
                    M2.e = dp;
                    M2.f33023f = dp2;
                    h6.w1(M2, h6.w0(i10, d6Var), false);
                    h6.w1(M2, h6.w0(i11, d6Var), true);
                    w9Var.setImageDrawable(M2);
                    return;
                }
                w9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                w9Var.getImageReceiver().setForUserOrChat(user, this.f21719b);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f21724s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                if (this.f21724s) {
                    f7 = 10.0f;
                }
                int dp3 = AndroidUtilities.dp(f7);
                this.f21725w = dp3;
                imageReceiver.setRoundRadius(dp3);
                w9Var.getImageReceiver().setForUserOrChat(chat, this.f21719b);
            }
        } else if (i12 == 7) {
            zq M3 = h6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp4 = AndroidUtilities.dp(16.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            M3.e = dp4;
            M3.f33023f = dp5;
            h6.w1(M3, h6.w0(i10, d6Var), false);
            h6.w1(M3, h6.w0(i11, d6Var), true);
            w9Var.setImageDrawable(M3);
        } else {
            w9Var.setImageDrawable(this.f21719b);
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
        ne.b bVar = this.f21718a;
        if (bVar.f17384f != z10) {
            p pVar = this.h;
            AndroidUtilities.cancelRunOnUIThread(pVar);
            bVar.a(z10, true);
            if (z10) {
                AndroidUtilities.runOnUIThread(pVar, 2000L);
            }
        }
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
