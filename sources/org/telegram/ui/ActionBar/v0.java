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
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.pr;
public class v0 extends FrameLayout implements xd.b {
    public final xd.a f22318a;
    public pq f22319b;
    public final p9 f22320c;
    public final ImageView d;
    public final TextView f22321e;
    public uf.e0 f22322f;
    public final p h;
    public final g6 f22323n;
    public boolean f22324r;
    public boolean f22325s;
    public int v;
    public int f22326w;

    public v0(Context context, g6 g6Var) {
        super(context);
        this.f22318a = new xd.a(0, this, pr.h, 380L, false);
        this.h = new p(this, 2);
        this.f22323n = g6Var;
        p9 p9Var = new p9(context);
        this.f22320c = p9Var;
        addView(p9Var, k7.c6.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, k7.c6.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f22321e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, k7.c6.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f22326w = AndroidUtilities.dp(28.0f);
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
        float f10 = this.f22318a.f50505e;
        boolean z4 = this.f22324r;
        g6 g6Var = this.f22323n;
        if (z4) {
            v02 = k6.l1(0.075f, k6.v0(k6.G6, g6Var));
        } else {
            v02 = k6.v0(k6.ci, g6Var);
        }
        int i10 = k6.Oh;
        int v03 = k6.v0(i10, g6Var);
        int v04 = k6.v0(k6.G6, g6Var);
        int i11 = k6.Sh;
        int v05 = k6.v0(i11, g6Var);
        this.v = i0.a.d(f10, v02, v03);
        this.f22321e.setTextColor(i0.a.d(f10, v04, v05));
        ImageView imageView = this.d;
        imageView.setColorFilter(v05);
        imageView.setAlpha(f10);
        float f11 = 0.82f * f10;
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        pq pqVar = this.f22319b;
        if (pqVar != null) {
            k6.v1(pqVar, k6.v0(i10, g6Var), false);
            k6.v1(this.f22319b, k6.v0(i11, g6Var), true);
        }
        this.f22320c.setAlpha(1.0f - f10);
        uf.e0 e0Var = this.f22322f;
        if (e0Var != null && e0Var.d == 7) {
            setData(e0Var);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.f22326w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, k6.l0(this.v));
        super.dispatchDraw(canvas);
    }

    public uf.e0 getFilter() {
        return this.f22322f;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.f22325s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), Integer.MIN_VALUE), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setData(uf.e0 e0Var) {
        this.f22322f = e0Var;
        this.f22325s = false;
        String str = e0Var.f48548c;
        if (str == null) {
            str = LocaleController.getString(e0Var.f48547b);
        }
        this.f22321e.setText(str);
        pq L = k6.L(AndroidUtilities.dp(32.0f), e0Var.f48546a);
        this.f22319b = L;
        int i10 = k6.Oh;
        g6 g6Var = this.f22323n;
        k6.v1(L, k6.v0(i10, g6Var), false);
        pq pqVar = this.f22319b;
        int i11 = k6.Sh;
        k6.v1(pqVar, k6.v0(i11, g6Var), true);
        int i12 = e0Var.d;
        float f10 = 16.0f;
        p9 p9Var = this.f22320c;
        if (i12 == 4) {
            TLObject tLObject = e0Var.f48550f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f20990id == user.f20990id) {
                    pq L2 = k6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp = AndroidUtilities.dp(16.0f);
                    int dp2 = AndroidUtilities.dp(16.0f);
                    L2.f30168e = dp;
                    L2.f30169f = dp2;
                    k6.v1(L2, k6.v0(i10, g6Var), false);
                    k6.v1(L2, k6.v0(i11, g6Var), true);
                    p9Var.setImageDrawable(L2);
                    return;
                }
                p9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                p9Var.getImageReceiver().setForUserOrChat(user, this.f22319b);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f22325s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = p9Var.getImageReceiver();
                if (this.f22325s) {
                    f10 = 10.0f;
                }
                int dp3 = AndroidUtilities.dp(f10);
                this.f22326w = dp3;
                imageReceiver.setRoundRadius(dp3);
                p9Var.getImageReceiver().setForUserOrChat(chat, this.f22319b);
            }
        } else if (i12 == 7) {
            pq L3 = k6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp4 = AndroidUtilities.dp(16.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            L3.f30168e = dp4;
            L3.f30169f = dp5;
            k6.v1(L3, k6.v0(i10, g6Var), false);
            k6.v1(L3, k6.v0(i11, g6Var), true);
            p9Var.setImageDrawable(L3);
        } else {
            p9Var.setImageDrawable(this.f22319b);
        }
    }

    public void setExpanded(boolean z4) {
        TextView textView = this.f22321e;
        if (z4) {
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        setSelectedForDelete(false);
    }

    public void setSelectedForDelete(boolean z4) {
        xd.a aVar = this.f22318a;
        if (aVar.f50506f != z4) {
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
