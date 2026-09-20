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
public final class hi0 extends FrameLayout {
    public final ArrayList f34214a;
    public final ArrayList f34215b;
    public final ArrayList f34216c;
    public final org.telegram.ui.Components.j9 d;
    public final org.telegram.ui.ActionBar.j5 e;
    public final int f34217f;
    public final boolean h;
    public final org.telegram.ui.Components.t00 f34218n;
    public boolean f34219r;
    public fc1 f34220s;

    public hi0(Context context, int i10, MessageObject messageObject, TLRPC.Chat chat) {
        super(context);
        boolean z10;
        int i11;
        long j3;
        this.f34214a = new ArrayList();
        this.f34215b = new ArrayList();
        this.f34216c = new ArrayList();
        this.f34217f = i10;
        if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.h = z10;
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        this.f34218n = t00Var;
        t00Var.f(org.telegram.ui.ActionBar.j6.G8, org.telegram.ui.ActionBar.j6.f19184i6, -1);
        t00Var.setViewType(13);
        t00Var.setIsSingleCell(false);
        addView(t00Var, w7.y5.c(-1.0f, -2));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.e = j5Var;
        j5Var.setTextSize(16);
        j5Var.setEllipsizeByGradient(true);
        j5Var.setRightPadding(AndroidUtilities.dp(62.0f));
        addView(j5Var, w7.y5.d(0, -2.0f, 19, 40.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(context, false);
        this.d = j9Var;
        j9Var.setStyle(11);
        j9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(j9Var, w7.y5.d(56, -1.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        TLRPC.TL_messages_getMessageReadParticipants tL_messages_getMessageReadParticipants = new TLRPC.TL_messages_getMessageReadParticipants();
        tL_messages_getMessageReadParticipants.msg_id = messageObject.getId();
        tL_messages_getMessageReadParticipants.peer = MessagesController.getInstance(i10).getInputPeer(messageObject.getDialogId());
        ImageView imageView = new ImageView(context);
        addView(imageView, w7.y5.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        if (z10) {
            i11 = R.drawable.msg_played;
        } else {
            i11 = R.drawable.msg_seen;
        }
        Drawable mutate = context.getDrawable(i11).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F8, false), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        j9Var.setAlpha(0.0f);
        j5Var.setAlpha(0.0f);
        TLRPC.Peer peer = messageObject.messageOwner.from_id;
        if (peer != null) {
            j3 = peer.user_id;
        } else {
            j3 = 0;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getMessageReadParticipants, new ai.j8(this, j3, i10, chat));
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), 6, 0));
        setEnabled(false);
    }

    public final org.telegram.ui.Components.vl0 a() {
        fc1 fc1Var = this.f34220s;
        if (fc1Var != null) {
            return fc1Var;
        }
        fc1 fc1Var2 = new fc1(getContext(), 10, null);
        this.f34220s = fc1Var2;
        getContext();
        fc1Var2.setLayoutManager(new s4.c0());
        this.f34220s.i(new ci.r1(this, 5));
        this.f34220s.setAdapter(new gg.n0(this, 3));
        return this.f34220s;
    }

    public final void b() {
        boolean z10;
        org.telegram.ui.Components.j9 j9Var;
        String str;
        ArrayList arrayList = this.f34216c;
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setEnabled(z10);
        int i10 = 0;
        while (true) {
            j9Var = this.d;
            if (i10 >= 3) {
                break;
            }
            int size = arrayList.size();
            int i11 = this.f34217f;
            if (i10 < size) {
                j9Var.b(i10, (TLObject) arrayList.get(i10), i11);
            } else {
                j9Var.b(i10, null, i11);
            }
            i10++;
        }
        if (arrayList.size() == 1) {
            j9Var.setTranslationX(AndroidUtilities.dp(24.0f));
        } else if (arrayList.size() == 2) {
            j9Var.setTranslationX(AndroidUtilities.dp(12.0f));
        } else {
            j9Var.setTranslationX(0.0f);
        }
        int dp = AndroidUtilities.dp((Math.min(2, arrayList.size() - 1) * 12) + 38);
        org.telegram.ui.ActionBar.j5 j5Var = this.e;
        j5Var.setRightPadding(dp);
        j9Var.a(false);
        ArrayList arrayList2 = this.f34214a;
        if (arrayList2.size() == 1 && arrayList.get(0) != null) {
            j5Var.l(ContactsController.formatName((TLObject) arrayList.get(0)), false);
        } else if (arrayList2.size() == 0) {
            j5Var.l(LocaleController.getString(R.string.NobodyViewed), false);
        } else {
            if (this.h) {
                str = "MessagePlayed";
            } else {
                str = "MessageSeen";
            }
            j5Var.l(LocaleController.formatPluralString(str, arrayList2.size(), new Object[0]), false);
        }
        j5Var.animate().alpha(1.0f).setDuration(220L).start();
        j9Var.animate().alpha(1.0f).setDuration(220L).start();
        org.telegram.ui.Components.t00 t00Var = this.f34218n;
        t00Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.ba(t00Var)).start();
        fc1 fc1Var = this.f34220s;
        if (fc1Var != null) {
            fc1Var.getAdapter();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        boolean z10 = true;
        this.f34219r = true;
        org.telegram.ui.Components.t00 t00Var = this.f34218n;
        if (t00Var.getVisibility() != 0) {
            z10 = false;
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.e;
        j5Var.setVisibility(8);
        if (z10) {
            t00Var.setVisibility(8);
        }
        super.onMeasure(i10, i11);
        if (z10) {
            t00Var.getLayoutParams().width = getMeasuredWidth();
            t00Var.setVisibility(0);
        }
        j5Var.setVisibility(0);
        j5Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(40.0f);
        this.f34219r = false;
        super.onMeasure(i10, i11);
    }

    @Override
    public final void requestLayout() {
        if (this.f34219r) {
            return;
        }
        super.requestLayout();
    }
}
