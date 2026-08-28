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
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.o9;
public class v0 extends FrameLayout implements td.b {
    public final td.a f23839a;
    public fq f23840b;
    public final o9 f23841c;
    public final ImageView d;
    public final TextView f23842e;
    public of.m0 f23843f;
    public final p h;
    public final b6 f23844n;
    public boolean f23845r;
    public boolean f23846s;
    public int v;
    public int f23847w;

    public v0(Context context, b6 b6Var) {
        super(context);
        this.f23839a = new td.a(0, this, gr.h, 380L, false);
        this.h = new p(this, 2);
        this.f23844n = b6Var;
        o9 o9Var = new o9(context);
        this.f23841c = o9Var;
        addView(o9Var, g7.e6.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, g7.e6.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f23842e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, g7.e6.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f23847w = AndroidUtilities.dp(28.0f);
        a();
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            a();
            invalidate();
        }
    }

    public final void a() {
        int v02;
        float f10 = this.f23839a.f47775e;
        boolean z10 = this.f23845r;
        b6 b6Var = this.f23844n;
        if (z10) {
            v02 = f6.l1(0.075f, f6.v0(f6.G6, b6Var));
        } else {
            v02 = f6.v0(f6.ci, b6Var);
        }
        int i9 = f6.Oh;
        int v03 = f6.v0(i9, b6Var);
        int v04 = f6.v0(f6.G6, b6Var);
        int i10 = f6.Sh;
        int v05 = f6.v0(i10, b6Var);
        this.v = i0.a.d(f10, v02, v03);
        this.f23842e.setTextColor(i0.a.d(f10, v04, v05));
        ImageView imageView = this.d;
        imageView.setColorFilter(v05);
        imageView.setAlpha(f10);
        float f11 = 0.82f * f10;
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        fq fqVar = this.f23840b;
        if (fqVar != null) {
            f6.v1(fqVar, f6.v0(i9, b6Var), false);
            f6.v1(this.f23840b, f6.v0(i10, b6Var), true);
        }
        this.f23841c.setAlpha(1.0f - f10);
        of.m0 m0Var = this.f23843f;
        if (m0Var != null && m0Var.d == 7) {
            setData(m0Var);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i9 = this.f23847w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i9, i9, f6.l0(this.v));
        super.dispatchDraw(canvas);
    }

    public of.m0 getFilter() {
        return this.f23843f;
    }

    @Override
    public void onMeasure(int i9, int i10) {
        if (this.f23846s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), Integer.MIN_VALUE), i10);
        } else {
            super.onMeasure(i9, i10);
        }
    }

    public void setData(of.m0 m0Var) {
        this.f23843f = m0Var;
        this.f23846s = false;
        String str = m0Var.f19420c;
        if (str == null) {
            str = LocaleController.getString(m0Var.f19419b);
        }
        this.f23842e.setText(str);
        fq L = f6.L(AndroidUtilities.dp(32.0f), m0Var.f19418a);
        this.f23840b = L;
        int i9 = f6.Oh;
        b6 b6Var = this.f23844n;
        f6.v1(L, f6.v0(i9, b6Var), false);
        fq fqVar = this.f23840b;
        int i10 = f6.Sh;
        f6.v1(fqVar, f6.v0(i10, b6Var), true);
        int i11 = m0Var.d;
        float f10 = 16.0f;
        o9 o9Var = this.f23841c;
        if (i11 == 4) {
            TLObject tLObject = m0Var.f19422f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f22527id == user.f22527id) {
                    fq L2 = f6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp = AndroidUtilities.dp(16.0f);
                    int dp2 = AndroidUtilities.dp(16.0f);
                    L2.f28545e = dp;
                    L2.f28546f = dp2;
                    f6.v1(L2, f6.v0(i9, b6Var), false);
                    f6.v1(L2, f6.v0(i10, b6Var), true);
                    o9Var.setImageDrawable(L2);
                    return;
                }
                o9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                o9Var.getImageReceiver().setForUserOrChat(user, this.f23840b);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f23846s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = o9Var.getImageReceiver();
                if (this.f23846s) {
                    f10 = 10.0f;
                }
                int dp3 = AndroidUtilities.dp(f10);
                this.f23847w = dp3;
                imageReceiver.setRoundRadius(dp3);
                o9Var.getImageReceiver().setForUserOrChat(chat, this.f23840b);
            }
        } else if (i11 == 7) {
            fq L3 = f6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp4 = AndroidUtilities.dp(16.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            L3.f28545e = dp4;
            L3.f28546f = dp5;
            f6.v1(L3, f6.v0(i9, b6Var), false);
            f6.v1(L3, f6.v0(i10, b6Var), true);
            o9Var.setImageDrawable(L3);
        } else {
            o9Var.setImageDrawable(this.f23840b);
        }
    }

    public void setExpanded(boolean z10) {
        TextView textView = this.f23842e;
        if (z10) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        setSelectedForDelete(false);
    }

    public void setSelectedForDelete(boolean z10) {
        td.a aVar = this.f23839a;
        if (aVar.f47776f != z10) {
            p pVar = this.h;
            AndroidUtilities.cancelRunOnUIThread(pVar);
            aVar.a(z10, true);
            if (z10) {
                AndroidUtilities.runOnUIThread(pVar, 2000L);
            }
        }
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
