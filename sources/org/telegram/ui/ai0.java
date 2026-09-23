package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ai0 extends FrameLayout {
    public final ArrayList f31799a;
    public final ArrayList f31800b;
    public final ArrayList f31801c;
    public final org.telegram.ui.Components.k9 d;
    public final org.telegram.ui.ActionBar.i5 e;
    public final int f31802f;
    public final boolean h;
    public final org.telegram.ui.Components.u00 f31803n;
    public boolean f31804r;
    public wb1 f31805s;

    public ai0(Context context, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        int i11;
        long j3;
        this.f31799a = new ArrayList();
        this.f31800b = new ArrayList();
        this.f31801c = new ArrayList();
        this.f31802f = i10;
        if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.h = z10;
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        this.f31803n = u00Var;
        u00Var.f(org.telegram.ui.ActionBar.h6.G8, org.telegram.ui.ActionBar.h6.f18878i6, -1);
        u00Var.setViewType(13);
        u00Var.setIsSingleCell(false);
        addView(u00Var, w7.x5.c(-1.0f, -2));
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.e = i5Var;
        i5Var.setTextSize(16);
        i5Var.setEllipsizeByGradient(true);
        i5Var.setRightPadding(AndroidUtilities.dp(62.0f));
        addView(i5Var, w7.x5.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context, false);
        this.d = k9Var;
        k9Var.setStyle(11);
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(k9Var, w7.x5.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        i5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E8, false));
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
        ImageView imageView = new ImageView(context);
        addView(imageView, w7.x5.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            i11 = R.drawable.msg_played;
        } else {
            i11 = R.drawable.msg_seen;
        }
        Drawable mutate = context.getDrawable(i11).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        k9Var.setAlpha(0.0f);
        i5Var.setAlpha(0.0f);
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        if (peer != null) {
            j3 = peer.user_id;
        } else {
            j3 = 0;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new ai.k8(this, j3, i10, chat));
        setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.I5, false), 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.ml0 a() {
        wb1 wb1Var = this.f31805s;
        if (wb1Var != null) {
            return wb1Var;
        }
        wb1 wb1Var2 = new wb1(getContext(), 10, null);
        this.f31805s = wb1Var2;
        getContext();
        wb1Var2.setLayoutManager(new s4.c0());
        this.f31805s.i(new ci.r1(this, 5));
        this.f31805s.setAdapter(new gg.n0(this, 3));
        return this.f31805s;
    }

    public final void b() {
        boolean z10;
        org.telegram.ui.Components.k9 k9Var;
        String str;
        ArrayList arrayList = this.f31801c;
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEnabled(z10);
        int i10 = 0;
        while (true) {
            k9Var = this.d;
            if (i10 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i11 = this.f31802f;
            if (i10 < size) {
                k9Var.b(i10, (TLObject) arrayList.get(i10), i11);
            } else {
                k9Var.b(i10, null, i11);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            k9Var.setTranslationX(AndroidUtilities.dp(24.0f));
        } else if (arrayList.size() == 2) {
            k9Var.setTranslationX(AndroidUtilities.dp(12.0f));
        } else {
            k9Var.setTranslationX(0.0f);
        }
        int dp = AndroidUtilities.dp((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.i5 i5Var = this.e;
        i5Var.setRightPadding(dp);
        k9Var.a(false);
        ArrayList arrayList2 = this.f31799a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            i5Var.l(ContactsController.formatName((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            i5Var.l(LocaleController.getString(R.string.NobodyViewed), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            i5Var.l(LocaleController.formatPluralString(str, arrayList2.size(), new Object[0]), false);
        }
        i5Var.animate().alpha(1.0f).setDuration(220L).start();
        k9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.u00 u00Var = this.f31803n;
        u00Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.ca(u00Var)).start();
        wb1 wb1Var = this.f31805s;
        if (wb1Var != null) {
            wb1Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z10 = true;
        this.f31804r = true;
        org.telegram.ui.Components.u00 u00Var = this.f31803n;
        if (u00Var.getVisibility() != 0) {
            z10 = false;
        }
        org.telegram.ui.ActionBar.i5 i5Var = this.e;
        i5Var.setVisibility(8);
        if (z10) {
            u00Var.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z10) {
            u00Var.getLayoutParams().width = getMeasuredWidth();
            u00Var.setVisibility(0);
        }
        i5Var.setVisibility(0);
        i5Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(40.0f);
        this.f31804r = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f31804r) {
            return;
        }
        super.requestLayout();
    }
}
