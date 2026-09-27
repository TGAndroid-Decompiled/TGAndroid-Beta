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
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.w9;
public class v0 extends FrameLayout implements le.e {
    public final le.c f19796a;
    public rq f19797b;
    public final w9 f19798c;
    public final ImageView d;
    public final TextView e;
    public gg.q0 f19799f;
    public final r h;
    public final e6 f19800n;
    public boolean f19801r;
    public boolean f19802s;
    public int v;
    public int f19803w;

    public v0(Context context, e6 e6Var) {
        super(context);
        this.f19796a = new le.c(0, this, sr.h, 380L, false);
        this.h = new r(this, 2);
        this.f19800n = e6Var;
        w9 w9Var = new w9(context);
        this.f19798c = w9Var;
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
        this.f19803w = AndroidUtilities.dp(28.0f);
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
        float f7 = this.f19796a.e;
        boolean z10 = this.f19801r;
        e6 e6Var = this.f19800n;
        if (z10) {
            v02 = i6.l1(0.075f, i6.v0(i6.G6, e6Var));
        } else {
            v02 = i6.v0(i6.f19050ci, e6Var);
        }
        int i10 = i6.Oh;
        int v03 = i6.v0(i10, e6Var);
        int v04 = i6.v0(i6.G6, e6Var);
        int i11 = i6.Sh;
        int v05 = i6.v0(i11, e6Var);
        this.v = i0.a.d(f7, v02, v03);
        this.e.setTextColor(i0.a.d(f7, v04, v05));
        ImageView imageView = this.d;
        imageView.setColorFilter(v05);
        imageView.setAlpha(f7);
        float f10 = 0.82f * f7;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        rq rqVar = this.f19797b;
        if (rqVar != null) {
            i6.v1(rqVar, i6.v0(i10, e6Var), false);
            i6.v1(this.f19797b, i6.v0(i11, e6Var), true);
        }
        this.f19798c.setAlpha(1.0f - f7);
        gg.q0 q0Var = this.f19799f;
        if (q0Var != null && q0Var.d == 7) {
            setData(q0Var);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.f19803w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, i6.l0(this.v));
        super.dispatchDraw(canvas);
    }

    public gg.q0 getFilter() {
        return this.f19799f;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.f19802s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), Integer.MIN_VALUE), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setData(gg.q0 q0Var) {
        this.f19799f = q0Var;
        this.f19802s = false;
        String str = q0Var.f9886c;
        if (str == null) {
            str = LocaleController.getString(q0Var.f9885b);
        }
        this.e.setText(str);
        rq L = i6.L(AndroidUtilities.dp(32.0f), q0Var.f9884a);
        this.f19797b = L;
        int i10 = i6.Oh;
        e6 e6Var = this.f19800n;
        i6.v1(L, i6.v0(i10, e6Var), false);
        rq rqVar = this.f19797b;
        int i11 = i6.Sh;
        i6.v1(rqVar, i6.v0(i11, e6Var), true);
        int i12 = q0Var.d;
        float f7 = 16.0f;
        w9 w9Var = this.f19798c;
        if (i12 == 4) {
            TLObject tLObject = q0Var.f9887f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f18476id == user.f18476id) {
                    rq L2 = i6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp = AndroidUtilities.dp(16.0f);
                    int dp2 = AndroidUtilities.dp(16.0f);
                    L2.e = dp;
                    L2.f28065f = dp2;
                    i6.v1(L2, i6.v0(i10, e6Var), false);
                    i6.v1(L2, i6.v0(i11, e6Var), true);
                    w9Var.setImageDrawable(L2);
                    return;
                }
                w9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                w9Var.getImageReceiver().setForUserOrChat(user, this.f19797b);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f19802s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                if (this.f19802s) {
                    f7 = 10.0f;
                }
                int dp3 = AndroidUtilities.dp(f7);
                this.f19803w = dp3;
                imageReceiver.setRoundRadius(dp3);
                w9Var.getImageReceiver().setForUserOrChat(chat, this.f19797b);
            }
        } else if (i12 == 7) {
            rq L3 = i6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp4 = AndroidUtilities.dp(16.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            L3.e = dp4;
            L3.f28065f = dp5;
            i6.v1(L3, i6.v0(i10, e6Var), false);
            i6.v1(L3, i6.v0(i11, e6Var), true);
            w9Var.setImageDrawable(L3);
        } else {
            w9Var.setImageDrawable(this.f19797b);
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
        le.c cVar = this.f19796a;
        if (cVar.f14203f != z10) {
            r rVar = this.h;
            AndroidUtilities.cancelRunOnUIThread(rVar);
            cVar.a(z10, true);
            if (z10) {
                AndroidUtilities.runOnUIThread(rVar, 2000L);
            }
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
