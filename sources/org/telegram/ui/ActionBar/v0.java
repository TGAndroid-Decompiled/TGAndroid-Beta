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
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.t9;
public class v0 extends FrameLayout implements vd.b {
    public final vd.a f23859a;
    public jq f23860b;
    public final t9 f23861c;
    public final ImageView d;
    public final TextView f23862e;
    public rf.f0 f23863f;
    public final q h;
    public final c6 f23864n;
    public boolean f23865r;
    public boolean f23866s;
    public int v;
    public int f23867w;

    public v0(Context context, c6 c6Var) {
        super(context);
        this.f23859a = new vd.a(0, this, jr.h, 380L, false);
        this.h = new q(this, 2);
        this.f23864n = c6Var;
        t9 t9Var = new t9(context);
        this.f23861c = t9Var;
        addView(t9Var, i7.f6.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, i7.f6.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f23862e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, i7.f6.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f23867w = AndroidUtilities.dp(28.0f);
        a();
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 0) {
            a();
            invalidate();
        }
    }

    public final void a() {
        int v02;
        float f9 = this.f23859a.f49505e;
        boolean z10 = this.f23865r;
        c6 c6Var = this.f23864n;
        if (z10) {
            v02 = g6.l1(0.075f, g6.v0(g6.G6, c6Var));
        } else {
            v02 = g6.v0(g6.ci, c6Var);
        }
        int i10 = g6.Oh;
        int v03 = g6.v0(i10, c6Var);
        int v04 = g6.v0(g6.G6, c6Var);
        int i11 = g6.Sh;
        int v05 = g6.v0(i11, c6Var);
        this.v = i0.a.d(f9, v02, v03);
        this.f23862e.setTextColor(i0.a.d(f9, v04, v05));
        ImageView imageView = this.d;
        imageView.setColorFilter(v05);
        imageView.setAlpha(f9);
        float f10 = 0.82f * f9;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        jq jqVar = this.f23860b;
        if (jqVar != null) {
            g6.v1(jqVar, g6.v0(i10, c6Var), false);
            g6.v1(this.f23860b, g6.v0(i11, c6Var), true);
        }
        this.f23861c.setAlpha(1.0f - f9);
        rf.f0 f0Var = this.f23863f;
        if (f0Var != null && f0Var.d == 7) {
            setData(f0Var);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.f23867w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, g6.l0(this.v));
        super.dispatchDraw(canvas);
    }

    public rf.f0 getFilter() {
        return this.f23863f;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.f23866s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), Integer.MIN_VALUE), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setData(rf.f0 f0Var) {
        this.f23863f = f0Var;
        this.f23866s = false;
        String str = f0Var.f47222c;
        if (str == null) {
            str = LocaleController.getString(f0Var.f47221b);
        }
        this.f23862e.setText(str);
        jq L = g6.L(AndroidUtilities.dp(32.0f), f0Var.f47220a);
        this.f23860b = L;
        int i10 = g6.Oh;
        c6 c6Var = this.f23864n;
        g6.v1(L, g6.v0(i10, c6Var), false);
        jq jqVar = this.f23860b;
        int i11 = g6.Sh;
        g6.v1(jqVar, g6.v0(i11, c6Var), true);
        int i12 = f0Var.d;
        float f9 = 16.0f;
        t9 t9Var = this.f23861c;
        if (i12 == 4) {
            TLObject tLObject = f0Var.f47224f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f22539id == user.f22539id) {
                    jq L2 = g6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp = AndroidUtilities.dp(16.0f);
                    int dp2 = AndroidUtilities.dp(16.0f);
                    L2.f29787e = dp;
                    L2.f29788f = dp2;
                    g6.v1(L2, g6.v0(i10, c6Var), false);
                    g6.v1(L2, g6.v0(i11, c6Var), true);
                    t9Var.setImageDrawable(L2);
                    return;
                }
                t9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                t9Var.getImageReceiver().setForUserOrChat(user, this.f23860b);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f23866s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = t9Var.getImageReceiver();
                if (this.f23866s) {
                    f9 = 10.0f;
                }
                int dp3 = AndroidUtilities.dp(f9);
                this.f23867w = dp3;
                imageReceiver.setRoundRadius(dp3);
                t9Var.getImageReceiver().setForUserOrChat(chat, this.f23860b);
            }
        } else if (i12 == 7) {
            jq L3 = g6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp4 = AndroidUtilities.dp(16.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            L3.f29787e = dp4;
            L3.f29788f = dp5;
            g6.v1(L3, g6.v0(i10, c6Var), false);
            g6.v1(L3, g6.v0(i11, c6Var), true);
            t9Var.setImageDrawable(L3);
        } else {
            t9Var.setImageDrawable(this.f23860b);
        }
    }

    public void setExpanded(boolean z10) {
        TextView textView = this.f23862e;
        if (z10) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        setSelectedForDelete(false);
    }

    public void setSelectedForDelete(boolean z10) {
        vd.a aVar = this.f23859a;
        if (aVar.f49506f != z10) {
            q qVar = this.h;
            AndroidUtilities.cancelRunOnUIThread(qVar);
            aVar.a(z10, true);
            if (z10) {
                AndroidUtilities.runOnUIThread(qVar, 2000L);
            }
        }
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
