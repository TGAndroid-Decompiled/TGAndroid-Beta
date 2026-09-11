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
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.x9;
public class u0 extends FrameLayout implements le.d {
    public final le.b f21355a;
    public oq f21356b;
    public final x9 f21357c;
    public final ImageView d;
    public final TextView f21358e;
    public hg.q0 f21359f;
    public final q h;
    public final f6 f21360n;
    public boolean f21361r;
    public boolean f21362s;
    public int v;
    public int f21363w;

    public u0(Context context, f6 f6Var) {
        super(context);
        this.f21355a = new le.b(0, this, pr.h, 380L, false);
        this.h = new q(this, 2);
        this.f21360n = f6Var;
        x9 x9Var = new x9(context);
        this.f21357c = x9Var;
        addView(x9Var, w7.x5.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, w7.x5.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f21358e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.x5.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f21363w = AndroidUtilities.dp(28.0f);
        a();
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            a();
            invalidate();
        }
    }

    public final void a() {
        int v02;
        float f7 = this.f21355a.f15368e;
        boolean z10 = this.f21361r;
        f6 f6Var = this.f21360n;
        if (z10) {
            v02 = j6.l1(0.075f, j6.v0(j6.G6, f6Var));
        } else {
            v02 = j6.v0(j6.f20656ci, f6Var);
        }
        int i10 = j6.Oh;
        int v03 = j6.v0(i10, f6Var);
        int v04 = j6.v0(j6.G6, f6Var);
        int i11 = j6.Sh;
        int v05 = j6.v0(i11, f6Var);
        this.v = i0.a.d(f7, v02, v03);
        this.f21358e.setTextColor(i0.a.d(f7, v04, v05));
        ImageView imageView = this.d;
        imageView.setColorFilter(v05);
        imageView.setAlpha(f7);
        float f10 = 0.82f * f7;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        oq oqVar = this.f21356b;
        if (oqVar != null) {
            j6.v1(oqVar, j6.v0(i10, f6Var), false);
            j6.v1(this.f21356b, j6.v0(i11, f6Var), true);
        }
        this.f21357c.setAlpha(1.0f - f7);
        hg.q0 q0Var = this.f21359f;
        if (q0Var != null && q0Var.d == 7) {
            setData(q0Var);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.f21363w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, j6.l0(this.v));
        super.dispatchDraw(canvas);
    }

    public hg.q0 getFilter() {
        return this.f21359f;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.f21362s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), Integer.MIN_VALUE), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setData(hg.q0 q0Var) {
        this.f21359f = q0Var;
        this.f21362s = false;
        String str = q0Var.f11217c;
        if (str == null) {
            str = LocaleController.getString(q0Var.f11216b);
        }
        this.f21358e.setText(str);
        oq L = j6.L(AndroidUtilities.dp(32.0f), q0Var.f11215a);
        this.f21356b = L;
        int i10 = j6.Oh;
        f6 f6Var = this.f21360n;
        j6.v1(L, j6.v0(i10, f6Var), false);
        oq oqVar = this.f21356b;
        int i11 = j6.Sh;
        j6.v1(oqVar, j6.v0(i11, f6Var), true);
        int i12 = q0Var.d;
        float f7 = 16.0f;
        x9 x9Var = this.f21357c;
        if (i12 == 4) {
            TLObject tLObject = q0Var.f11219f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f20016id == user.f20016id) {
                    oq L2 = j6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp = AndroidUtilities.dp(16.0f);
                    int dp2 = AndroidUtilities.dp(16.0f);
                    L2.f29162e = dp;
                    L2.f29163f = dp2;
                    j6.v1(L2, j6.v0(i10, f6Var), false);
                    j6.v1(L2, j6.v0(i11, f6Var), true);
                    x9Var.setImageDrawable(L2);
                    return;
                }
                x9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                x9Var.getImageReceiver().setForUserOrChat(user, this.f21356b);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f21362s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = x9Var.getImageReceiver();
                if (this.f21362s) {
                    f7 = 10.0f;
                }
                int dp3 = AndroidUtilities.dp(f7);
                this.f21363w = dp3;
                imageReceiver.setRoundRadius(dp3);
                x9Var.getImageReceiver().setForUserOrChat(chat, this.f21356b);
            }
        } else if (i12 == 7) {
            oq L3 = j6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp4 = AndroidUtilities.dp(16.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            L3.f29162e = dp4;
            L3.f29163f = dp5;
            j6.v1(L3, j6.v0(i10, f6Var), false);
            j6.v1(L3, j6.v0(i11, f6Var), true);
            x9Var.setImageDrawable(L3);
        } else {
            x9Var.setImageDrawable(this.f21356b);
        }
    }

    public void setExpanded(boolean z10) {
        TextView textView = this.f21358e;
        if (z10) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        setSelectedForDelete(false);
    }

    public void setSelectedForDelete(boolean z10) {
        le.b bVar = this.f21355a;
        if (bVar.f15369f != z10) {
            q qVar = this.h;
            AndroidUtilities.cancelRunOnUIThread(qVar);
            bVar.a(z10, true);
            if (z10) {
                AndroidUtilities.runOnUIThread(qVar, 2000L);
            }
        }
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
