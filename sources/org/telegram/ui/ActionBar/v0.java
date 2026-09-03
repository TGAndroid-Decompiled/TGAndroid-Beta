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
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p9;
public class v0 extends FrameLayout implements xd.b {
    public final xd.a f20581a;
    public mq f20582b;
    public final p9 f20583c;
    public final ImageView d;
    public final TextView e;
    public tf.e0 f20584f;
    public final p h;
    public final f6 f20585n;
    public boolean f20586r;
    public boolean f20587s;
    public int v;
    public int f20588w;

    public v0(Context context, f6 f6Var) {
        super(context);
        this.f20581a = new xd.a(0, this, mr.h, 380L, false);
        this.h = new p(this, 2);
        this.f20585n = f6Var;
        p9 p9Var = new p9(context);
        this.f20583c = p9Var;
        addView(p9Var, k7.b6.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, k7.b6.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, k7.b6.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f20588w = AndroidUtilities.dp(28.0f);
        a();
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            a();
            invalidate();
        }
    }

    public final void a() {
        int v02;
        float f10 = this.f20581a.e;
        boolean z4 = this.f20586r;
        f6 f6Var = this.f20585n;
        if (z4) {
            v02 = j6.l1(0.075f, j6.v0(j6.G6, f6Var));
        } else {
            v02 = j6.v0(j6.ci, f6Var);
        }
        int i10 = j6.Oh;
        int v03 = j6.v0(i10, f6Var);
        int v04 = j6.v0(j6.G6, f6Var);
        int i11 = j6.Sh;
        int v05 = j6.v0(i11, f6Var);
        this.v = i0.a.d(f10, v02, v03);
        this.e.setTextColor(i0.a.d(f10, v04, v05));
        ImageView imageView = this.d;
        imageView.setColorFilter(v05);
        imageView.setAlpha(f10);
        float f11 = 0.82f * f10;
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        mq mqVar = this.f20582b;
        if (mqVar != null) {
            j6.v1(mqVar, j6.v0(i10, f6Var), false);
            j6.v1(this.f20582b, j6.v0(i11, f6Var), true);
        }
        this.f20583c.setAlpha(1.0f - f10);
        tf.e0 e0Var = this.f20584f;
        if (e0Var != null && e0Var.d == 7) {
            setData(e0Var);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.f20588w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, j6.l0(this.v));
        super.dispatchDraw(canvas);
    }

    public tf.e0 getFilter() {
        return this.f20584f;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.f20587s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), Integer.MIN_VALUE), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setData(tf.e0 e0Var) {
        this.f20584f = e0Var;
        this.f20587s = false;
        String str = e0Var.f44767c;
        if (str == null) {
            str = LocaleController.getString(e0Var.f44766b);
        }
        this.e.setText(str);
        mq L = j6.L(AndroidUtilities.dp(32.0f), e0Var.f44765a);
        this.f20582b = L;
        int i10 = j6.Oh;
        f6 f6Var = this.f20585n;
        j6.v1(L, j6.v0(i10, f6Var), false);
        mq mqVar = this.f20582b;
        int i11 = j6.Sh;
        j6.v1(mqVar, j6.v0(i11, f6Var), true);
        int i12 = e0Var.d;
        float f10 = 16.0f;
        p9 p9Var = this.f20583c;
        if (i12 == 4) {
            TLObject tLObject = e0Var.f44768f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f19306id == user.f19306id) {
                    mq L2 = j6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp = AndroidUtilities.dp(16.0f);
                    int dp2 = AndroidUtilities.dp(16.0f);
                    L2.e = dp;
                    L2.f27112f = dp2;
                    j6.v1(L2, j6.v0(i10, f6Var), false);
                    j6.v1(L2, j6.v0(i11, f6Var), true);
                    p9Var.setImageDrawable(L2);
                    return;
                }
                p9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                p9Var.getImageReceiver().setForUserOrChat(user, this.f20582b);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f20587s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = p9Var.getImageReceiver();
                if (this.f20587s) {
                    f10 = 10.0f;
                }
                int dp3 = AndroidUtilities.dp(f10);
                this.f20588w = dp3;
                imageReceiver.setRoundRadius(dp3);
                p9Var.getImageReceiver().setForUserOrChat(chat, this.f20582b);
            }
        } else if (i12 == 7) {
            mq L3 = j6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp4 = AndroidUtilities.dp(16.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            L3.e = dp4;
            L3.f27112f = dp5;
            j6.v1(L3, j6.v0(i10, f6Var), false);
            j6.v1(L3, j6.v0(i11, f6Var), true);
            p9Var.setImageDrawable(L3);
        } else {
            p9Var.setImageDrawable(this.f20582b);
        }
    }

    public void setExpanded(boolean z4) {
        TextView textView = this.e;
        if (z4) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        setSelectedForDelete(false);
    }

    public void setSelectedForDelete(boolean z4) {
        xd.a aVar = this.f20581a;
        if (aVar.f46961f != z4) {
            p pVar = this.h;
            AndroidUtilities.cancelRunOnUIThread(pVar);
            aVar.a(z4, true);
            if (z4) {
                AndroidUtilities.runOnUIThread(pVar, 2000L);
            }
        }
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
