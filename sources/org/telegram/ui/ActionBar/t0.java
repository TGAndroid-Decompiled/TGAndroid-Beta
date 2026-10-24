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
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.zr;
public class t0 extends FrameLayout implements ne.d, b6 {
    public int E;
    public wq F;
    public int G;
    public int H;
    public ColorFilter I;
    public int J;
    public final ne.b f21844a;
    public wq f21845b;
    public final u9 f21846c;
    public final ImageView d;
    public final TextView e;
    public hg.o0 f21847f;
    public final p h;
    public final g6 f21848n;
    public boolean f21849r;
    public boolean f21850s;
    public int v;
    public int f21851w;
    public wq f21852x;
    public int f21853y;

    public t0(Context context, g6 g6Var) {
        super(context);
        this.f21844a = new ne.b(0, this, zr.h, 380L, false);
        this.h = new p(this, 2);
        this.f21848n = g6Var;
        u9 u9Var = new u9(context);
        this.f21846c = u9Var;
        addView(u9Var, w7.z5.c(32.0f, 32));
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
        this.f21851w = AndroidUtilities.dp(28.0f);
        updateColors();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.f21851w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, k6.m0(this.v));
        super.dispatchDraw(canvas);
    }

    public hg.o0 getFilter() {
        return this.f21847f;
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            updateColors();
            invalidate();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.f21850s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), Integer.MIN_VALUE), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setData(hg.o0 o0Var) {
        this.f21847f = o0Var;
        this.f21850s = false;
        String str = o0Var.f12030c;
        if (str == null) {
            str = LocaleController.getString(o0Var.f12029b);
        }
        this.e.setText(str);
        wq M = k6.M(AndroidUtilities.dp(32.0f), o0Var.f12028a);
        this.f21845b = M;
        int i10 = k6.Oh;
        g6 g6Var = this.f21848n;
        k6.y1(M, k6.w0(i10, g6Var), false);
        wq wqVar = this.f21845b;
        int i11 = k6.Sh;
        k6.y1(wqVar, k6.w0(i11, g6Var), true);
        int i12 = o0Var.d;
        float f7 = 16.0f;
        u9 u9Var = this.f21846c;
        if (i12 == 4) {
            TLObject tLObject = o0Var.f12031f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f20491id == user.f20491id) {
                    wq M2 = k6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp = AndroidUtilities.dp(16.0f);
                    int dp2 = AndroidUtilities.dp(16.0f);
                    M2.e = dp;
                    M2.f32325f = dp2;
                    k6.y1(M2, k6.w0(i10, g6Var), false);
                    k6.y1(M2, k6.w0(i11, g6Var), true);
                    u9Var.setImageDrawable(M2);
                    return;
                }
                u9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                u9Var.getImageReceiver().setForUserOrChat(user, this.f21845b);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f21850s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = u9Var.getImageReceiver();
                if (this.f21850s) {
                    f7 = 10.0f;
                }
                int dp3 = AndroidUtilities.dp(f7);
                this.f21851w = dp3;
                imageReceiver.setRoundRadius(dp3);
                u9Var.getImageReceiver().setForUserOrChat(chat, this.f21845b);
            }
        } else if (i12 == 7) {
            wq M3 = k6.M(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp4 = AndroidUtilities.dp(16.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            M3.e = dp4;
            M3.f32325f = dp5;
            k6.y1(M3, k6.w0(i10, g6Var), false);
            k6.y1(M3, k6.w0(i11, g6Var), true);
            u9Var.setImageDrawable(M3);
            this.f21852x = M3;
            this.f21853y = k6.w0(i10, g6Var);
            this.E = k6.w0(i11, g6Var);
        } else {
            u9Var.setImageDrawable(this.f21845b);
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
        ne.b bVar = this.f21844a;
        if (bVar.f17447f != z10) {
            p pVar = this.h;
            AndroidUtilities.cancelRunOnUIThread(pVar);
            bVar.a(z10, true);
            if (z10) {
                AndroidUtilities.runOnUIThread(pVar, 2000L);
            }
        }
    }

    @Override
    public final void updateColors() {
        int w02;
        float f7 = this.f21844a.e;
        boolean z10 = this.f21849r;
        g6 g6Var = this.f21848n;
        if (z10) {
            w02 = k6.o1(0.075f, k6.w0(k6.G6, g6Var));
        } else {
            w02 = k6.w0(k6.f21177ci, g6Var);
        }
        int i10 = k6.Oh;
        int w03 = k6.w0(i10, g6Var);
        int w04 = k6.w0(k6.G6, g6Var);
        int i11 = k6.Sh;
        int w05 = k6.w0(i11, g6Var);
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
        int w06 = k6.w0(i10, g6Var);
        int w07 = k6.w0(i11, g6Var);
        wq wqVar = this.f21845b;
        if (wqVar != null && (wqVar != this.F || w06 != this.G || w07 != this.H)) {
            k6.y1(wqVar, w06, false);
            k6.y1(this.f21845b, w07, true);
            this.F = this.f21845b;
            this.G = w06;
            this.H = w07;
        }
        float f11 = 1.0f - f7;
        u9 u9Var = this.f21846c;
        u9Var.setAlpha(f11);
        hg.o0 o0Var = this.f21847f;
        if (o0Var != null && o0Var.d == 7) {
            wq wqVar2 = this.f21852x;
            if (wqVar2 != null) {
                if (w06 != this.f21853y || w07 != this.E) {
                    k6.y1(wqVar2, w06, false);
                    k6.y1(this.f21852x, w07, true);
                    this.f21853y = w06;
                    this.E = w07;
                    u9Var.invalidate();
                }
            } else {
                setData(o0Var);
            }
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
