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
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.yc;
public final class o0 {
    public boolean A;
    public boolean B;
    public float C;
    public VelocityTracker D;
    public final ln0 E;
    public n0 F;
    public ka G;
    public final u1 f22673a;
    public int f22674b;
    public long f22675c;
    public MessageObject d;
    public long e;
    public StaticLayout f22677g;
    public float h;
    public float f22678i;
    public int f22679j;
    public float f22684o;
    public float f22685p;
    public ba0 f22688s;
    public final org.telegram.ui.Components.f6 f22690u;
    public e11 v;
    public final yc f22693y;
    public final TextPaint f22676f = new TextPaint(1);
    public final Paint f22680k = new Paint(1);
    public final Path f22681l = new Path();
    public final float f22682m = -1.0f;
    public int f22683n = AndroidUtilities.dp(66.0f);
    public final ArrayList f22686q = new ArrayList();
    public final Path f22687r = new Path();
    public final RectF f22691w = new RectF();
    public final RectF f22692x = new RectF();
    public final Paint f22694z = new Paint(1);
    public boolean f22689t = true;

    public o0(u1 u1Var) {
        this.f22673a = u1Var;
        this.E = new ln0(u1Var.getContext(), null);
        this.f22693y = new yc(u1Var);
        this.f22690u = new org.telegram.ui.Components.f6(u1Var, 350L, bs.h);
    }

    public final boolean a(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.a(android.view.MotionEvent):boolean");
    }

    public final void b() {
        ln0 ln0Var = this.E;
        if (ln0Var.b()) {
            float f7 = ln0Var.f28265j;
            this.f22684o = f7;
            this.f22684o = Utilities.clamp(f7, this.f22685p - (this.f22691w.width() - AndroidUtilities.dp(14.0f)), 0.0f);
            this.f22673a.a3();
        }
    }

    public final void c(android.graphics.Canvas r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.o0.c(android.graphics.Canvas):void");
    }

    public final boolean d() {
        if (this.d.channelJoinedExpanded && this.f22686q.size() > 0) {
            return true;
        }
        return false;
    }

    public final void e(MessageObject messageObject) {
        StaticLayout staticLayout;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        int i10;
        TLObject tLObject;
        TLObject tLObject2;
        int i11;
        int i12;
        this.f22674b = messageObject.currentAccount;
        this.d = messageObject;
        this.f22675c = messageObject.getDialogId();
        MessagesController.getInstance(this.f22674b).getChat(Long.valueOf(-this.f22675c));
        this.e = -this.f22675c;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.f22676f;
        textPaint.setTypeface(bold);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        int i13 = org.telegram.ui.ActionBar.h6.f21083ic;
        u1 u1Var = this.f22673a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(i13, u1Var.Id));
        this.f22677g = new StaticLayout(LocaleController.getString(R.string.ChannelJoined), textPaint, this.d.getMaxMessageTextWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        this.h = staticLayout.getWidth();
        this.f22678i = 0.0f;
        for (int i14 = 0; i14 < this.f22677g.getLineCount(); i14++) {
            this.h = Math.min(this.h, this.f22677g.getLineLeft(i14));
            this.f22678i = Math.max(this.f22678i, this.f22677g.getLineRight(i14));
        }
        this.f22679j = this.f22677g.getHeight();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f22694z;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.W5, u1Var.Id));
        u1Var.f23471s0 = AndroidUtilities.dp(14.66f) + this.f22679j;
        int i15 = 0;
        while (true) {
            arrayList = this.f22686q;
            if (i15 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i15);
            int i16 = 0;
            while (true) {
                ImageReceiver[] imageReceiverArr = n0Var.f22625c;
                if (i16 < imageReceiverArr.length) {
                    imageReceiverArr[i16].onDetachedFromWindow();
                    i16++;
                }
            }
            i15++;
        }
        arrayList.clear();
        MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(this.f22674b).getChannelRecommendations(this.f22675c);
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
        if (!arrayList2.isEmpty() && (UserConfig.getInstance(this.f22674b).isPremium() || arrayList2.size() != 1)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f22689t = z10;
        if (!z10) {
            int size = arrayList2.size();
            if (!UserConfig.getInstance(this.f22674b).isPremium() && channelRecommendations.more > 0) {
                size = Math.min(size - 1, MessagesController.getInstance(this.f22674b).recommendedChannelsLimitDefault);
            }
            int min = Math.min(size, 10);
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new n0(this.f22674b, u1Var, (TLObject) arrayList2.get(i18)));
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
                arrayList.add(new n0(this.f22674b, u1Var, new TLObject[]{tLObject, tLObject2, tLObject4}, (arrayList2.size() + channelRecommendations.more) - min));
            }
        }
        if (this.v == null) {
            if (this.f22675c > 0) {
                i10 = R.string.SimilarBots;
            } else {
                i10 = R.string.SimilarChannels;
            }
            e11 e11Var = new e11(LocaleController.getString(i10), 14.0f, AndroidUtilities.bold());
            e11Var.f25739o = true;
            this.v = e11Var;
        }
        if (d()) {
            u1Var.f23471s0 = AndroidUtilities.dp(144.0f) + u1Var.f23471s0;
            this.f22680k.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21250ra, u1Var.Id));
        }
        float size2 = ((arrayList.size() - 1) * AndroidUtilities.dp(9.0f)) + (arrayList.size() * this.f22683n);
        this.f22685p = size2;
        this.f22684o = Utilities.clamp(this.f22684o, size2, 0.0f);
    }
}
