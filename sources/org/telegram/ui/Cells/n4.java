package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mq;
public final class n4 extends FrameLayout {
    public boolean A;
    public final org.telegram.ui.Components.y5 B;
    public long C;
    public int D;
    public zf.z0 E;
    public Drawable F;
    public final org.telegram.ui.Components.o9 f24747a;
    public final bg.t f24748b;
    public final org.telegram.ui.Components.z8 f24749c;
    public int d;
    public TLRPC.User f24750e;
    public long f24751f;
    public final int h;
    public float f24752n;
    public boolean f24753r;
    public final mq f24754s;
    public final dp v;
    public final boolean f24755w;
    public boolean f24756x;
    public final org.telegram.ui.Components.y5 f24757y;

    public n4(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.f24749c = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        gr grVar = gr.h;
        this.f24757y = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        this.B = new org.telegram.ui.Components.y5(this, 0L, 350L, grVar);
        this.D = org.telegram.ui.ActionBar.f6.f23001d6;
        this.f24755w = z10;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f24747a = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(o9Var, g7.e6.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        bg.t tVar = new bg.t(context, 6);
        this.f24748b = tVar;
        NotificationCenter.listenEmojiLoading(tVar);
        tVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        tVar.setTextSize(1, 12.0f);
        tVar.setMaxLines(1);
        tVar.setGravity(49);
        tVar.setLines(1);
        tVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(tVar, g7.e6.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        mq mqVar = new mq(context, b6Var);
        this.f24754s = mqVar;
        addView(mqVar, g7.e6.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i9 = org.telegram.ui.ActionBar.f6.W8;
        int i10 = org.telegram.ui.ActionBar.f6.U8;
        lq lqVar = mqVar.f30905a;
        lqVar.v = i9;
        lqVar.f30533w = i10;
        mqVar.setGravity(5);
        if (z10) {
            dp dpVar = new dp(context, 21, b6Var);
            this.v = dpVar;
            dpVar.b(org.telegram.ui.ActionBar.f6.B5, org.telegram.ui.ActionBar.f6.f23072h5, org.telegram.ui.ActionBar.f6.C5);
            dpVar.setDrawUnchecked(false);
            dpVar.setDrawBackgroundAsArc(4);
            dpVar.setProgressDelegate(new ia(this, 4));
            addView(dpVar, g7.e6.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            dpVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j10, String str) {
        if (this.f24751f != j10) {
            this.f24753r = false;
            invalidate();
        }
        this.f24751f = j10;
        boolean isUserDialog = DialogObject.isUserDialog(j10);
        org.telegram.ui.Components.o9 o9Var = this.f24747a;
        org.telegram.ui.Components.z8 z8Var = this.f24749c;
        int i9 = this.h;
        bg.t tVar = this.f24748b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
            this.f24750e = user;
            if (str != null) {
                tVar.setText(str);
            } else if (user != null) {
                tVar.setText(UserObject.getFirstName(user));
            } else {
                tVar.setText("");
            }
            z8Var.m(i9, this.f24750e);
            o9Var.e(this.f24750e, z8Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
            if (str != null) {
                tVar.setText(str);
            } else if (chat != null) {
                tVar.setText(chat.title);
            } else {
                tVar.setText("");
            }
            z8Var.k(i9, chat);
            this.f24750e = null;
            o9Var.e(chat, z8Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i9) {
        int i10;
        int i11 = MessagesController.UPDATE_MASK_STATUS & i9;
        int i12 = this.h;
        if (i11 != 0 && this.f24750e != null) {
            this.f24750e = MessagesController.getInstance(i12).getUser(Long.valueOf(this.f24750e.f22527id));
            this.f24747a.invalidate();
            invalidate();
        }
        if (i9 == 0 || (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i9) != 0 || (i9 & MessagesController.UPDATE_MASK_NEW_MESSAGE) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(this.f24751f);
            mq mqVar = this.f24754s;
            if (dialog != null && (i10 = dialog.unread_count) != 0) {
                if (this.d != i10) {
                    this.d = i10;
                    mqVar.f30905a.c(i10, this.f24753r);
                    return;
                }
                return;
            }
            this.d = 0;
            mqVar.f30905a.c(0, this.f24753r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f24756x && this.f24750e != null) {
            requirementToContact = MessagesController.getInstance(this.h).isUserContactBlocked(this.f24750e.f22527id);
        } else {
            requirementToContact = null;
        }
        if (this.A == DialogObject.isPremiumBlocked(requirementToContact) && this.C == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.A = DialogObject.isPremiumBlocked(requirementToContact);
        this.C = DialogObject.getMessagesStarsPrice(requirementToContact);
        if (!z10) {
            this.f24757y.f(this.A, true);
            if (this.C > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.B.f(z11, true);
        }
        invalidate();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r20, android.view.View r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n4.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getDialogId() {
        return this.f24751f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f24755w) {
            org.telegram.ui.Components.o9 o9Var = this.f24747a;
            int measuredWidth = (o9Var.getMeasuredWidth() / 2) + o9Var.getLeft();
            int measuredHeight = (o9Var.getMeasuredHeight() / 2) + o9Var.getTop();
            org.telegram.ui.ActionBar.f6.f23191o0.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B5, false));
            org.telegram.ui.ActionBar.f6.f23191o0.setAlpha((int) (this.v.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.f6.f23191o0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
        this.f24754s.f30905a.E = AndroidUtilities.dp(13.0f);
    }
}
