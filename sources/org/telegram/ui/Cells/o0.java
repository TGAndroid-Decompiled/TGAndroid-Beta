package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.VelocityTracker;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.wm0;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final wm0 E;
    public n0 F;
    public ja G;
    public final t1 f23248a;
    public int f23249b;
    public long f23250c;
    public MessageObject d;
    public long f23251e;
    public StaticLayout f23253g;
    public float h;
    public float f23254i;
    public int f23255j;
    public float f23260o;
    public float f23261p;
    public k90 f23264s;
    public final org.telegram.ui.Components.z5 f23266u;
    public l01 v;
    public final rc f23269y;
    public final TextPaint f23252f = new TextPaint(1);
    public final Paint f23256k = new Paint(1);
    public final Path f23257l = new Path();
    public final float f23258m = -1.0f;
    public int f23259n = AndroidUtilities.dp(66.0f);
    public final ArrayList f23262q = new ArrayList();
    public final Path f23263r = new Path();
    public final RectF f23267w = new RectF();
    public final RectF f23268x = new RectF();
    public final Paint f23270z = new Paint(1);
    public boolean f23265t = true;

    public o0(t1 t1Var) {
        this.f23248a = t1Var;
        this.E = new wm0(t1Var.getContext(), null);
        this.f23269y = new rc(t1Var);
        this.f23266u = new org.telegram.ui.Components.z5(t1Var, 350L, pr.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        wm0 wm0Var = this.E;
        if (wm0Var.b()) {
            float f10 = wm0Var.f32809j;
            this.f23260o = f10;
            this.f23260o = Utilities.clamp(f10, this.f23261p - (this.f23267w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f23248a.a3();
        }
    }

    public final void c(android.graphics.Canvas r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f23262q.size() > 0) {
            return true;
        }
        return false;
    }

    public final void e(MessageObject messageObject) {
        StaticLayout staticLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z4;
        int i10;
        TLObject tLObject;
        TLObject tLObject2;
        int i11;
        int i12;
        this.f23249b = messageObject.currentAccount;
        this.d = messageObject;
        this.f23250c = messageObject.getDialogId();
        MessagesController.getInstance(this.f23249b).getChat(Long.valueOf(-this.f23250c));
        this.f23251e = -this.f23250c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f23252f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.k6.ic;
        t1 t1Var = this.f23248a;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.v0(i13, t1Var.Fd));
        this.f23253g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f23254i = 0.0f;
        for (int i14 = 0; i14 < this.f23253g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f23253g.getLineLeft(i14));
            this.f23254i = Math.max(this.f23254i, this.f23253g.getLineRight(i14));
        }
        this.f23255j = this.f23253g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f23270z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.W5, t1Var.Fd));
        t1Var.f23982p0 = AndroidUtilities.dp(14.66f) + this.f23255j;
        int i15 = 0;
        while (true) {
            arrayList = this.f23262q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f23191c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f23249b).getChannelRecommendations(this.f23250c);
        if (channelRecommendations != null && channelRecommendations.chats != null) {
            arrayList2 = new ArrayList(channelRecommendations.chats);
        } else {
            arrayList2 = new ArrayList();
        }
        int i17 = 0;
        while (i17 < arrayList2.size()) {
            TLObject tLObject3 = (TLObject) arrayList2.get(i17);
            if ((tLObject3 instanceof TLRPC.Chat) && !ChatObject.isNotInChat((TLRPC.Chat) tLObject3)) {
                arrayList2.remove(i17);
                i17--;
            }
            i17++;
        }
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f23249b).isPremium() || arrayList2.size() != 1)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f23265t = z4;
        if (!z4) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f23249b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f23249b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f23249b, t1Var, (TLObject) arrayList2.get(i18)));
            }
            if (min < arrayList2.size()) {
                TLObject tLObject4 = null;
                if (min >= 0 && min < arrayList2.size()) {
                    tLObject = (TLObject) arrayList2.get(min);
                } else {
                    tLObject = null;
                }
                if (min >= 0 && (i12 = min + 1) < arrayList2.size()) {
                    tLObject2 = (TLObject) arrayList2.get(i12);
                } else {
                    tLObject2 = null;
                }
                if (min >= 0 && (i11 = min + 2) < arrayList2.size()) {
                    tLObject4 = (TLObject) arrayList2.get(i11);
                }
                arrayList.add(new n0(this.f23249b, t1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f23250c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            l01 l01Var = new l01(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            l01Var.f28531o = true;
            this.v = l01Var;
        }
        if (d()) {
            t1Var.f23982p0 = AndroidUtilities.dp(144.0f) + t1Var.f23982p0;
            this.f23256k.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21916ra, t1Var.Fd));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f23259n);
        this.f23261p = size2;
        this.f23260o = Utilities.clamp(this.f23260o, size2, 0.0f);
    }
}
