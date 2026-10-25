package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.y9;
public class v0 extends FrameLayout implements oe.d, p6 {
    public int E;
    public ar F;
    public int G;
    public int H;
    public ColorFilter I;
    public int J;
    public final oe.b f23142a;
    public ar f23143b;
    public final y9 f23144c;
    public final ImageView d;
    public final TextView e;
    public ig.p0 f23145f;
    public final q h;
    public final u6 f23146n;
    public boolean f23147r;
    public boolean f23148s;
    public int v;
    public int f23149w;
    public ar f23150x;
    public int f23151y;

    public v0(Context context, u6 u6Var) {
        super(context);
        this.f23142a = new oe.b(0, this, ds.h, 380L, false);
        this.h = new q(this, 2);
        this.f23146n = u6Var;
        y9 y9Var = new y9(context);
        this.f23144c = y9Var;
        addView(y9Var, gb1.g(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, gb1.h(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, gb1.h(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f23149w = AndroidUtilities.dp(28.0f);
        updateColors();
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            updateColors();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.f23149w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, y6.m0(this.v));
        super.dispatchDraw(canvas);
    }

    public ig.p0 getFilter() {
        return this.f23145f;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.f23148s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), Integer.MIN_VALUE), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setData(ig.p0 p0Var) {
        this.f23145f = p0Var;
        this.f23148s = false;
        String str = p0Var.f14200c;
        if (str == null) {
            str = LocaleController.getString(p0Var.f14199b);
        }
        this.e.setText(str);
        ar M = y6.M(AndroidUtilities.dp(32.0f), p0Var.f14198a);
        this.f23143b = M;
        int i10 = y6.Oh;
        u6 u6Var = this.f23146n;
        y6.y1(M, y6.w0(i10, u6Var), false);
        ar arVar = this.f23143b;
        int i11 = y6.Sh;
        y6.y1(arVar, y6.w0(i11, u6Var), true);
        int i12 = p0Var.d;
        float f7 = 16.0f;
        y9 y9Var = this.f23144c;
        if (i12 == 4) {
            TLObject tLObject = p0Var.f14201f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f22174id == user.f22174id) {
                    ar M2 = y6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp = AndroidUtilities.dp(16.0f);
                    int dp2 = AndroidUtilities.dp(16.0f);
                    M2.e = dp;
                    M2.f26593f = dp2;
                    y6.y1(M2, y6.w0(i10, u6Var), false);
                    y6.y1(M2, y6.w0(i11, u6Var), true);
                    y9Var.setImageDrawable(M2);
                    return;
                }
                y9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                y9Var.getImageReceiver().setForUserOrChat(user, this.f23143b);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f23148s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = y9Var.getImageReceiver();
                if (this.f23148s) {
                    f7 = 10.0f;
                }
                int dp3 = AndroidUtilities.dp(f7);
                this.f23149w = dp3;
                imageReceiver.setRoundRadius(dp3);
                y9Var.getImageReceiver().setForUserOrChat(chat, this.f23143b);
            }
        } else if (i12 == 7) {
            ar M3 = y6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp4 = AndroidUtilities.dp(16.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            M3.e = dp4;
            M3.f26593f = dp5;
            y6.y1(M3, y6.w0(i10, u6Var), false);
            y6.y1(M3, y6.w0(i11, u6Var), true);
            y9Var.setImageDrawable(M3);
            this.f23150x = M3;
            this.f23151y = y6.w0(i10, u6Var);
            this.E = y6.w0(i11, u6Var);
        } else {
            y9Var.setImageDrawable(this.f23143b);
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
        oe.b bVar = this.f23142a;
        if (bVar.f19327f != z10) {
            q qVar = this.h;
            AndroidUtilities.cancelRunOnUIThread(qVar);
            bVar.a(z10, true);
            if (z10) {
                AndroidUtilities.runOnUIThread(qVar, 2000L);
            }
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        float f7 = this.f23142a.e;
        boolean z10 = this.f23147r;
        u6 u6Var = this.f23146n;
        if (z10) {
            w02 = y6.o1(0.075f, y6.w0(y6.G6, u6Var));
        } else {
            w02 = y6.w0(y6.f23347ci, u6Var);
        }
        int i10 = y6.Oh;
        int w03 = y6.w0(i10, u6Var);
        int w04 = y6.w0(y6.G6, u6Var);
        int i11 = y6.Sh;
        int w05 = y6.w0(i11, u6Var);
        this.v = i0.a.f(f7, w02, w03);
        this.e.setTextColor(i0.a.f(f7, w04, w05));
        ImageView imageView = this.d;
        if (imageView.getColorFilter() != this.I || this.J != w05) {
            imageView.setColorFilter(w05);
            this.I = imageView.getColorFilter();
            this.J = w05;
        }
        imageView.setAlpha(f7);
        float f10 = 0.82f * f7;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        int w06 = y6.w0(i10, u6Var);
        int w07 = y6.w0(i11, u6Var);
        ar arVar = this.f23143b;
        if (arVar != null && (arVar != this.F || w06 != this.G || w07 != this.H)) {
            y6.y1(arVar, w06, false);
            y6.y1(this.f23143b, w07, true);
            this.F = this.f23143b;
            this.G = w06;
            this.H = w07;
        }
        float f11 = 1.0f - f7;
        y9 y9Var = this.f23144c;
        y9Var.setAlpha(f11);
        ig.p0 p0Var = this.f23145f;
        if (p0Var != null && p0Var.d == 7) {
            ar arVar2 = this.f23150x;
            if (arVar2 != null) {
                if (w06 != this.f23151y || w07 != this.E) {
                    y6.y1(arVar2, w06, false);
                    y6.y1(this.f23150x, w07, true);
                    this.f23151y = w06;
                    this.E = w07;
                    y9Var.invalidate();
                }
            } else {
                setData(p0Var);
            }
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
