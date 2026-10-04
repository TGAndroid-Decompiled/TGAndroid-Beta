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
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w9;
public class u0 extends FrameLayout implements le.d {
    public final le.b f21525a;
    public sq f21526b;
    public final w9 f21527c;
    public final ImageView d;
    public final TextView f21528e;
    public gg.q0 f21529f;
    public final q h;
    public final d6 f21530n;
    public boolean f21531r;
    public boolean f21532s;
    public int v;
    public int f21533w;

    public u0(Context context, d6 d6Var) {
        super(context);
        this.f21525a = new le.b(0, this, tr.h, 380L, false);
        this.h = new q(this, 2);
        this.f21530n = d6Var;
        w9 w9Var = new w9(context);
        this.f21527c = w9Var;
        addView(w9Var, w7.z5.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, w7.z5.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f21528e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.z5.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f21533w = AndroidUtilities.dp(28.0f);
        a();
    }

    public final void a() {
        int v02;
        float f7 = this.f21525a.f15435e;
        boolean z10 = this.f21531r;
        d6 d6Var = this.f21530n;
        if (z10) {
            v02 = i6.l1(0.075f, i6.v0(i6.G6, d6Var));
        } else {
            v02 = i6.v0(i6.f20811ci, d6Var);
        }
        int i10 = i6.Oh;
        int v03 = i6.v0(i10, d6Var);
        int v04 = i6.v0(i6.G6, d6Var);
        int i11 = i6.Sh;
        int v05 = i6.v0(i11, d6Var);
        this.v = i0.a.d(f7, v02, v03);
        this.f21528e.setTextColor(i0.a.d(f7, v04, v05));
        ImageView imageView = this.d;
        imageView.setColorFilter(v05);
        imageView.setAlpha(f7);
        float f10 = 0.82f * f7;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        sq sqVar = this.f21526b;
        if (sqVar != null) {
            i6.v1(sqVar, i6.v0(i10, d6Var), false);
            i6.v1(this.f21526b, i6.v0(i11, d6Var), true);
        }
        this.f21527c.setAlpha(1.0f - f7);
        gg.q0 q0Var = this.f21529f;
        if (q0Var != null && q0Var.d == 7) {
            setData(q0Var);
        }
        invalidate();
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            a();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.f21533w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, i6.l0(this.v));
        super.dispatchDraw(canvas);
    }

    public gg.q0 getFilter() {
        return this.f21529f;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.f21532s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), Integer.MIN_VALUE), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setData(gg.q0 q0Var) {
        this.f21529f = q0Var;
        this.f21532s = false;
        String str = q0Var.f10756c;
        if (str == null) {
            str = LocaleController.getString(q0Var.f10755b);
        }
        this.f21528e.setText(str);
        sq L = i6.L(AndroidUtilities.dp(32.0f), q0Var.f10754a);
        this.f21526b = L;
        int i10 = i6.Oh;
        d6 d6Var = this.f21530n;
        i6.v1(L, i6.v0(i10, d6Var), false);
        sq sqVar = this.f21526b;
        int i11 = i6.Sh;
        i6.v1(sqVar, i6.v0(i11, d6Var), true);
        int i12 = q0Var.d;
        float f7 = 16.0f;
        w9 w9Var = this.f21527c;
        if (i12 == 4) {
            TLObject tLObject = q0Var.f10758f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f20185id == user.f20185id) {
                    sq L2 = i6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp = AndroidUtilities.dp(16.0f);
                    int dp2 = AndroidUtilities.dp(16.0f);
                    L2.f30852e = dp;
                    L2.f30853f = dp2;
                    i6.v1(L2, i6.v0(i10, d6Var), false);
                    i6.v1(L2, i6.v0(i11, d6Var), true);
                    w9Var.setImageDrawable(L2);
                    return;
                }
                w9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                w9Var.getImageReceiver().setForUserOrChat(user, this.f21526b);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f21532s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = w9Var.getImageReceiver();
                if (this.f21532s) {
                    f7 = 10.0f;
                }
                int dp3 = AndroidUtilities.dp(f7);
                this.f21533w = dp3;
                imageReceiver.setRoundRadius(dp3);
                w9Var.getImageReceiver().setForUserOrChat(chat, this.f21526b);
            }
        } else if (i12 == 7) {
            sq L3 = i6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp4 = AndroidUtilities.dp(16.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            L3.f30852e = dp4;
            L3.f30853f = dp5;
            i6.v1(L3, i6.v0(i10, d6Var), false);
            i6.v1(L3, i6.v0(i11, d6Var), true);
            w9Var.setImageDrawable(L3);
        } else {
            w9Var.setImageDrawable(this.f21526b);
        }
    }

    public void setExpanded(boolean z10) {
        TextView textView = this.f21528e;
        if (z10) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        setSelectedForDelete(false);
    }

    public void setSelectedForDelete(boolean z10) {
        le.b bVar = this.f21525a;
        if (bVar.f15436f != z10) {
            q qVar = this.h;
            AndroidUtilities.cancelRunOnUIThread(qVar);
            bVar.a(z10, true);
            if (z10) {
                AndroidUtilities.runOnUIThread(qVar, 2000L);
            }
        }
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
