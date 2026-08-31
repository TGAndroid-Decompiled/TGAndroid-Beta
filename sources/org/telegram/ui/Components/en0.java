package org.telegram.ui.Components;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class en0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public final Activity C;
    public final org.telegram.ui.ActionBar.p2 D;
    public boolean E;
    public org.telegram.ui.s10 F;
    public final org.telegram.ui.l10 G;
    public String H;
    public String I;
    public xm0 J;
    public final al0 K;
    public boolean L;
    public boolean M;
    public final ax0 f26583a;
    public final mh.d1 f26584b;
    public final dn0 f26585c;
    public final int d;
    public final ArrayList f26586e;
    public final ArrayList f26587f;
    public final ArrayList h;
    public final ArrayList f26588n;
    public int f26589r;
    public int f26590s;
    public int v;
    public int f26591w;
    public int f26592x;
    public int f26593y;

    public en0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        super(p2Var.getParentActivity());
        dn0 dn0Var = new dn0(this);
        this.f26585c = dn0Var;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.f26586e = arrayList;
        this.f26587f = new ArrayList();
        this.h = new ArrayList();
        this.f26588n = new ArrayList();
        this.f26590s = -1;
        this.v = -1;
        this.f26591w = -1;
        this.f26592x = -1;
        this.f26593y = -1;
        this.B = -1;
        this.G = new org.telegram.ui.l10(0, 0L);
        this.D = p2Var;
        this.C = p2Var.getParentActivity();
        this.d = i10;
        mh.d1 d1Var = new mh.d1(this, getContext(), 17);
        this.f26584b = d1Var;
        new f2.f0(new org.telegram.ui.cp(this, 2)).d(d1Var);
        addView(d1Var);
        p2Var.getParentActivity();
        d1Var.setLayoutManager(new org.telegram.ui.k(8));
        d1Var.setAdapter(dn0Var);
        d1Var.setOnScrollListener(new nb0(this, 4));
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.f5910m = false;
        d1Var.setItemAnimator(lVar);
        d1Var.setOnItemClickListener(new ym0(this, i10, 0));
        d1Var.setOnItemLongClickListener(new hv(this, 16));
        this.K = new al0(d1Var, true);
        u00 u00Var = new u00(getContext(), null);
        addView(u00Var);
        u00Var.setUseHeaderOffset(true);
        u00Var.setViewType(3);
        u00Var.setVisibility(8);
        ax0 ax0Var = new ax0(getContext(), u00Var, 1, null);
        this.f26583a = ax0Var;
        addView(ax0Var);
        d1Var.setEmptyView(ax0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        mh.d1 d1Var;
        MessageObject message;
        int i10 = this.d;
        if (!UserConfig.getInstance(i10).isPremium() && (d1Var = this.f26584b) != null) {
            for (int i11 = 0; i11 < d1Var.getChildCount(); i11++) {
                try {
                    View childAt = d1Var.getChildAt(i11);
                    if ((childAt instanceof an0) && (message = ((an0) childAt).f25298a.getMessage()) != null) {
                        if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(false);
                        } else if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(true);
                        } else {
                            continue;
                        }
                        return;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }
    }

    public final void b(int i10, int i11, boolean z4) {
        setClipToPadding(false);
        this.M = z4;
        setPadding(0, i10, 0, i11);
        mh.d1 d1Var = this.f26584b;
        if (z4) {
            d1Var.o1(0, i10, 0, i11);
        } else {
            d1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.M = false;
    }

    public final void c(boolean z4) {
        float f10;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.p2 p2Var = this.D;
        if (p2Var != null && this.f26584b.D) {
            long currentTimeMillis = System.currentTimeMillis();
            int i12 = this.d;
            if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= MessagesController.getInstance(i12).uploadPremiumSpeedupNotifyPeriod * 1000) {
                ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
                if (!UserConfig.getInstance(i12).isPremium() && !MessagesController.getInstance(i12).premiumFeaturesBlocked()) {
                    if (z4) {
                        f10 = MessagesController.getInstance(i12).uploadPremiumSpeedupUpload;
                    } else {
                        f10 = MessagesController.getInstance(i12).uploadPremiumSpeedupDownload;
                    }
                    SpannableString spannableString = new SpannableString(Double.toString(Math.round(f10 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                    spannableString.setSpan(new g51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    if (!p2Var.hasStoryViewer()) {
                        qc a02 = qc.a0(p2Var);
                        int i13 = R.raw.speed_limit;
                        if (z4) {
                            i10 = R.string.UploadSpeedLimited;
                        } else {
                            i10 = R.string.DownloadSpeedLimited;
                        }
                        String string = LocaleController.getString(i10);
                        if (z4) {
                            i11 = R.string.UploadSpeedLimitedMessage;
                        } else {
                            i11 = R.string.DownloadSpeedLimitedMessage;
                        }
                        ic M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new kh.f(25, this, z4)), spannableString), i13);
                        M.f27745j = 8000;
                        M.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z4) {
        long j10;
        dn0 dn0Var = this.f26585c;
        dn0Var.q(0, dn0Var.f26301c.f26589r);
        if (!TextUtils.isEmpty(this.H)) {
            int i10 = this.d;
            if (!DownloadController.getInstance(i10).downloadingFiles.isEmpty() || !DownloadController.getInstance(i10).recentDownloadingFiles.isEmpty()) {
                this.f26583a.setStickerType(1);
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                FileLoader.getInstance(this.d).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(this.d).getRecentLoadingFiles(arrayList2);
                String lowerCase = this.H.toLowerCase();
                boolean equals = lowerCase.equals(this.I);
                this.I = lowerCase;
                Utilities.searchQueue.cancelRunnable(this.J);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                xm0 xm0Var = new xm0(this, arrayList, lowerCase, arrayList2);
                this.J = xm0Var;
                if (equals) {
                    j10 = 0;
                } else {
                    j10 = 300;
                }
                dispatchQueue.postRunnable(xm0Var, j10);
                this.f26588n.clear();
                this.h.clear();
                if (!equals) {
                    this.f26583a.e(true, true);
                    e(this.h, this.f26588n, z4);
                    return;
                }
                return;
            }
        }
        if (this.f26589r == 0) {
            this.K.b(0);
        }
        if (this.L) {
            this.h.clear();
            this.f26588n.clear();
        }
        FileLoader.getInstance(this.d).getCurrentLoadingFiles(this.h);
        FileLoader.getInstance(this.d).getRecentLoadingFiles(this.f26588n);
        for (int i11 = 0; i11 < this.f26586e.size(); i11++) {
            ((MessageObject) this.f26586e.get(i11)).setQuery(null);
        }
        for (int i12 = 0; i12 < this.f26587f.size(); i12++) {
            ((MessageObject) this.f26587f.get(i12)).setQuery(null);
        }
        this.I = null;
        e(this.h, this.f26588n, z4);
        if (this.f26589r == 0) {
            this.f26583a.e(false, false);
            this.f26583a.d.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.f26583a.f25364e.setVisibility(8);
        }
        this.f26583a.setStickerType(9);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.onDownloadingFilesChanged) {
            if (getVisibility() == 0) {
                DownloadController.getInstance(this.d).clearUnviewedDownloads();
            }
            d(true);
        } else if (i10 == NotificationCenter.premiumFloodWaitReceived) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z4) {
        f2.m1 T;
        dn0 dn0Var = this.f26585c;
        if (z4) {
            int i10 = this.f26590s;
            int i11 = this.v;
            int i12 = this.f26591w;
            int i13 = this.f26592x;
            int i14 = this.f26593y;
            int i15 = this.B;
            int i16 = this.f26589r;
            ArrayList arrayList3 = new ArrayList(this.f26586e);
            ArrayList arrayList4 = new ArrayList(this.f26587f);
            f(arrayList, arrayList2);
            f2.q.c(new zm0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).b(dn0Var);
            int i17 = 0;
            while (true) {
                mh.d1 d1Var = this.f26584b;
                if (i17 < d1Var.getChildCount()) {
                    View childAt = d1Var.getChildAt(i17);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = d1Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.u3) {
                            dn0Var.v(T, R);
                        } else if (childAt instanceof an0) {
                            org.telegram.ui.Cells.i7 i7Var = ((an0) childAt).f25298a;
                            i7Var.f(true);
                            int id2 = i7Var.getMessage().getId();
                            long dialogId = i7Var.getMessage().getDialogId();
                            org.telegram.ui.l10 l10Var = this.G;
                            l10Var.f38557a = dialogId;
                            l10Var.f38558b = id2;
                            i7Var.b(this.F.b(l10Var), true);
                        }
                    }
                    i17++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            dn0Var.l();
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.f26586e;
        arrayList3.clear();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            MessageObject messageObject = (MessageObject) obj;
            if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
                arrayList3.add(messageObject);
            }
        }
        ArrayList arrayList4 = this.f26587f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            MessageObject messageObject2 = (MessageObject) obj2;
            if (!messageObject2.isRoundVideo() && !messageObject2.isVoice()) {
                arrayList4.add(messageObject2);
            }
        }
        this.f26589r = 0;
        this.f26590s = -1;
        this.v = -1;
        this.f26591w = -1;
        this.f26592x = -1;
        this.f26593y = -1;
        this.B = -1;
        this.E = false;
        if (!arrayList3.isEmpty()) {
            int i13 = this.f26589r;
            int i14 = i13 + 1;
            this.f26589r = i14;
            this.f26590s = i13;
            this.v = i14;
            int size3 = arrayList3.size() + i14;
            this.f26589r = size3;
            this.f26591w = size3;
            while (true) {
                if (i10 >= arrayList3.size()) {
                    break;
                } else if (FileLoader.getInstance(this.d).isLoadingFile(((MessageObject) arrayList3.get(i10)).getFileName())) {
                    this.E = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            int i15 = this.f26589r;
            int i16 = i15 + 1;
            this.f26589r = i16;
            this.f26592x = i15;
            this.f26593y = i16;
            int size4 = arrayList4.size() + i16;
            this.f26589r = size4;
            this.B = size4;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.d).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(this.d).addObserver(this, NotificationCenter.premiumFloodWaitReceived);
        if (getVisibility() == 0) {
            DownloadController.getInstance(this.d).clearUnviewedDownloads();
        }
        if (!this.L) {
            this.L = true;
            Utilities.searchQueue.postRunnable(new ec0(this, 20));
        }
        d(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.d;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.premiumFloodWaitReceived);
    }

    @Override
    public final void requestLayout() {
        if (this.M) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.s10 s10Var) {
        this.F = s10Var;
    }
}
