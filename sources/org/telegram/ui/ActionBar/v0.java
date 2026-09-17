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
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u9;
public class v0 extends FrameLayout implements le.d {
    public final le.b f19585a;
    public pq f19586b;
    public final u9 f19587c;
    public final ImageView d;
    public final TextView e;
    public gg.q0 f19588f;
    public final r h;
    public final f6 f19589n;
    public boolean f19590r;
    public boolean f19591s;
    public int v;
    public int f19592w;

    public v0(Context context, f6 f6Var) {
        super(context);
        this.f19585a = new le.b(0, this, qr.h, 380L, false);
        this.h = new r(this, 2);
        this.f19589n = f6Var;
        u9 u9Var = new u9(context);
        this.f19587c = u9Var;
        addView(u9Var, w7.x5.c(32.0f, 32));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageResource(R.drawable.ic_close_white);
        addView(imageView, w7.x5.d(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 14.0f);
        addView(textView, w7.x5.d(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
        this.f19592w = AndroidUtilities.dp(28.0f);
        a();
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            a();
            invalidate();
        }
    }

    public final void a() {
        int v02;
        float f7 = this.f19585a.e;
        boolean z10 = this.f19590r;
        f6 f6Var = this.f19589n;
        if (z10) {
            v02 = j6.l1(0.075f, j6.v0(j6.G6, f6Var));
        } else {
            v02 = j6.v0(j6.f18855ci, f6Var);
        }
        int i10 = j6.Oh;
        int v03 = j6.v0(i10, f6Var);
        int v04 = j6.v0(j6.G6, f6Var);
        int i11 = j6.Sh;
        int v05 = j6.v0(i11, f6Var);
        this.v = i0.a.d(f7, v02, v03);
        this.e.setTextColor(i0.a.d(f7, v04, v05));
        ImageView imageView = this.d;
        imageView.setColorFilter(v05);
        imageView.setAlpha(f7);
        float f10 = 0.82f * f7;
        imageView.setScaleX(f10);
        imageView.setScaleY(f10);
        pq pqVar = this.f19586b;
        if (pqVar != null) {
            j6.v1(pqVar, j6.v0(i10, f6Var), false);
            j6.v1(this.f19586b, j6.v0(i11, f6Var), true);
        }
        this.f19587c.setAlpha(1.0f - f7);
        gg.q0 q0Var = this.f19588f;
        if (q0Var != null && q0Var.d == 7) {
            setData(q0Var);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        int i10 = this.f19592w;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, i10, i10, j6.l0(this.v));
        super.dispatchDraw(canvas);
    }

    public gg.q0 getFilter() {
        return this.f19588f;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (this.f19591s) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), Integer.MIN_VALUE), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setData(gg.q0 q0Var) {
        this.f19588f = q0Var;
        this.f19591s = false;
        String str = q0Var.f9899c;
        if (str == null) {
            str = LocaleController.getString(q0Var.f9898b);
        }
        this.e.setText(str);
        pq L = j6.L(AndroidUtilities.dp(32.0f), q0Var.f9897a);
        this.f19586b = L;
        int i10 = j6.Oh;
        f6 f6Var = this.f19589n;
        j6.v1(L, j6.v0(i10, f6Var), false);
        pq pqVar = this.f19586b;
        int i11 = j6.Sh;
        j6.v1(pqVar, j6.v0(i11, f6Var), true);
        int i12 = q0Var.d;
        float f7 = 16.0f;
        u9 u9Var = this.f19587c;
        if (i12 == 4) {
            TLObject tLObject = q0Var.f9900f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f18268id == user.f18268id) {
                    pq L2 = j6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp = AndroidUtilities.dp(16.0f);
                    int dp2 = AndroidUtilities.dp(16.0f);
                    L2.e = dp;
                    L2.f27109f = dp2;
                    j6.v1(L2, j6.v0(i10, f6Var), false);
                    j6.v1(L2, j6.v0(i11, f6Var), true);
                    u9Var.setImageDrawable(L2);
                    return;
                }
                u9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                u9Var.getImageReceiver().setForUserOrChat(user, this.f19586b);
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                this.f19591s = ChatObject.isCommunity(chat);
                ImageReceiver imageReceiver = u9Var.getImageReceiver();
                if (this.f19591s) {
                    f7 = 10.0f;
                }
                int dp3 = AndroidUtilities.dp(f7);
                this.f19592w = dp3;
                imageReceiver.setRoundRadius(dp3);
                u9Var.getImageReceiver().setForUserOrChat(chat, this.f19586b);
            }
        } else if (i12 == 7) {
            pq L3 = j6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            int dp4 = AndroidUtilities.dp(16.0f);
            int dp5 = AndroidUtilities.dp(16.0f);
            L3.e = dp4;
            L3.f27109f = dp5;
            j6.v1(L3, j6.v0(i10, f6Var), false);
            j6.v1(L3, j6.v0(i11, f6Var), true);
            u9Var.setImageDrawable(L3);
        } else {
            u9Var.setImageDrawable(this.f19586b);
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
        le.b bVar = this.f19585a;
        if (bVar.f13985f != z10) {
            r rVar = this.h;
            AndroidUtilities.cancelRunOnUIThread(rVar);
            bVar.a(z10, true);
            if (z10) {
                AndroidUtilities.runOnUIThread(rVar, 2000L);
            }
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
