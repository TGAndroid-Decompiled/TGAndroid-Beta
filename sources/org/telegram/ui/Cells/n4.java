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
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.wr;
public final class n4 extends FrameLayout {
    public boolean E;
    public final org.telegram.ui.Components.d6 F;
    public long G;
    public int H;
    public qg.c1 I;
    public Drawable J;
    public final org.telegram.ui.Components.w9 f19559a;
    public final di.h f19560b;
    public final org.telegram.ui.Components.g9 f19561c;
    public int d;
    public TLRPC.User e;
    public long f19562f;
    public final int h;
    public float f19563n;
    public boolean f19564r;
    public final cr f19565s;
    public final tp v;
    public final boolean f19566w;
    public boolean f19567x;
    public final org.telegram.ui.Components.d6 f19568y;

    public n4(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.f19561c = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        new RectF();
        this.h = UserConfig.selectedAccount;
        wr wrVar = wr.h;
        this.f19568y = new org.telegram.ui.Components.d6(this, 0L, 350L, wrVar);
        this.F = new org.telegram.ui.Components.d6(this, 0L, 350L, wrVar);
        this.H = org.telegram.ui.ActionBar.j6.f17928d6;
        this.f19566w = z10;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f19559a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(27.0f));
        addView(w9Var, w7.a6.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        di.h hVar = new di.h(context, 4);
        this.f19560b = hVar;
        NotificationCenter.listenEmojiLoading(hVar);
        hVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        hVar.setTextSize(1, 12.0f);
        hVar.setMaxLines(1);
        hVar.setGravity(49);
        hVar.setLines(1);
        hVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(hVar, w7.a6.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        cr crVar = new cr(context, f6Var);
        this.f19565s = crVar;
        addView(crVar, w7.a6.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.j6.W8;
        int i11 = org.telegram.ui.ActionBar.j6.U8;
        br brVar = crVar.f22215a;
        brVar.v = i10;
        brVar.f21887w = i11;
        crVar.setGravity(5);
        if (z10) {
            tp tpVar = new tp(context, 21, f6Var);
            this.v = tpVar;
            tpVar.b(org.telegram.ui.ActionBar.j6.B5, org.telegram.ui.ActionBar.j6.f17998h5, org.telegram.ui.ActionBar.j6.C5);
            tpVar.setDrawUnchecked(false);
            tpVar.setDrawBackgroundAsArc(4);
            tpVar.setProgressDelegate(new na(this, 4));
            addView(tpVar, w7.a6.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            tpVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j3, String str) {
        if (this.f19562f != j3) {
            this.f19564r = false;
            invalidate();
        }
        this.f19562f = j3;
        boolean isUserDialog = DialogObject.isUserDialog(j3);
        org.telegram.ui.Components.w9 w9Var = this.f19559a;
        org.telegram.ui.Components.g9 g9Var = this.f19561c;
        int i10 = this.h;
        di.h hVar = this.f19560b;
        if (isUserDialog) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            this.e = user;
            if (str != null) {
                hVar.setText(str);
            } else if (user != null) {
                hVar.setText(UserObject.getFirstName(user));
            } else {
                hVar.setText("");
            }
            g9Var.m(i10, this.e);
            w9Var.e(this.e, g9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            if (str != null) {
                hVar.setText(str);
            } else if (chat != null) {
                hVar.setText(chat.title);
            } else {
                hVar.setText("");
            }
            g9Var.k(i10, chat);
            this.e = null;
            w9Var.e(chat, g9Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i10) {
        int i11;
        int i12 = MessagesController.UPDATE_MASK_STATUS & i10;
        int i13 = this.h;
        if (i12 != 0 && this.e != null) {
            this.e = MessagesController.getInstance(i13).getUser(Long.valueOf(this.e.f17342id));
            this.f19559a.invalidate();
            invalidate();
        }
        if (i10 == 0 || (MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE & i10) != 0 || (i10 & MessagesController.UPDATE_MASK_NEW_MESSAGE) != 0) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) MessagesController.getInstance(i13).dialogs_dict.f(this.f19562f);
            cr crVar = this.f19565s;
            if (dialog != null && (i11 = dialog.unread_count) != 0) {
                if (this.d != i11) {
                    this.d = i11;
                    crVar.f22215a.c(i11, this.f19564r);
                    return;
                }
                return;
            }
            this.d = 0;
            crVar.f22215a.c(0, this.f19564r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact requirementToContact;
        boolean z11;
        if (this.f19567x && this.e != null) {
            requirementToContact = MessagesController.getInstance(this.h).isUserContactBlocked(this.e.f17342id);
        } else {
            requirementToContact = null;
        }
        if (this.E == DialogObject.isPremiumBlocked(requirementToContact) && this.G == DialogObject.getMessagesStarsPrice(requirementToContact)) {
            return;
        }
        this.E = DialogObject.isPremiumBlocked(requirementToContact);
        this.G = DialogObject.getMessagesStarsPrice(requirementToContact);
        if (!z10) {
            this.f19568y.f(this.E, true);
            if (this.G > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.F.f(z11, true);
        }
        invalidate();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r20, android.view.View r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.n4.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    public long getDialogId() {
        return this.f19562f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f19566w) {
            org.telegram.ui.Components.w9 w9Var = this.f19559a;
            int measuredWidth = (w9Var.getMeasuredWidth() / 2) + w9Var.getLeft();
            int measuredHeight = (w9Var.getMeasuredHeight() / 2) + w9Var.getTop();
            org.telegram.ui.ActionBar.j6.f18120o0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B5, false));
            org.telegram.ui.ActionBar.j6.f18120o0.setAlpha((int) (this.v.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.j6.f18120o0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
        this.f19565s.f22215a.E = AndroidUtilities.dp(13.0f);
    }
}
