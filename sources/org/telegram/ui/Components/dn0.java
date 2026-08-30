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
public final class dn0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public final Activity C;
    public final org.telegram.ui.ActionBar.p2 D;
    public boolean E;
    public org.telegram.ui.s10 F;
    public final org.telegram.ui.l10 G;
    public String H;
    public String I;
    public wm0 J;
    public final zk0 K;
    public boolean L;
    public boolean M;
    public final zw0 f24307a;
    public final lh.e1 f24308b;
    public final cn0 f24309c;
    public final int d;
    public final ArrayList e;
    public final ArrayList f24310f;
    public final ArrayList h;
    public final ArrayList f24311n;
    public int f24312r;
    public int f24313s;
    public int v;
    public int f24314w;
    public int f24315x;
    public int f24316y;

    public dn0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        super(p2Var.getParentActivity());
        cn0 cn0Var = new cn0(this);
        this.f24309c = cn0Var;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f24310f = new ArrayList();
        this.h = new ArrayList();
        this.f24311n = new ArrayList();
        this.f24313s = -1;
        this.v = -1;
        this.f24314w = -1;
        this.f24315x = -1;
        this.f24316y = -1;
        this.B = -1;
        this.G = new org.telegram.ui.l10(0, 0L);
        this.D = p2Var;
        this.C = p2Var.getParentActivity();
        this.d = i10;
        lh.e1 e1Var = new lh.e1(this, getContext(), 17);
        this.f24308b = e1Var;
        new f2.e0(new oh.f(this, 3)).d(e1Var);
        addView(e1Var);
        p2Var.getParentActivity();
        e1Var.setLayoutManager(new org.telegram.ui.k(8));
        e1Var.setAdapter(cn0Var);
        e1Var.setOnScrollListener(new lb0(this, 4));
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.f5818m = false;
        e1Var.setItemAnimator(lVar);
        e1Var.setOnItemClickListener(new xm0(this, i10, 0));
        e1Var.setOnItemLongClickListener(new fv(this, 16));
        this.K = new zk0(e1Var, true);
        t00 t00Var = new t00(getContext(), null);
        addView(t00Var);
        t00Var.setUseHeaderOffset(true);
        t00Var.setViewType(3);
        t00Var.setVisibility(8);
        zw0 zw0Var = new zw0(getContext(), t00Var, 1, null);
        this.f24307a = zw0Var;
        addView(zw0Var);
        e1Var.setEmptyView(zw0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        lh.e1 e1Var;
        MessageObject message;
        int i10 = this.d;
        if (!UserConfig.getInstance(i10).isPremium() && (e1Var = this.f24308b) != null) {
            for (int i11 = 0; i11 < e1Var.getChildCount(); i11++) {
                try {
                    View childAt = e1Var.getChildAt(i11);
                    if ((childAt instanceof zm0) && (message = ((zm0) childAt).f31383a.getMessage()) != null) {
                        if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(false);
                        } else if (FileLoader.getInstance(i10).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(true);
                        } else {
                            continue;
                        }
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void b(int i10, int i11, boolean z4) {
        setClipToPadding(false);
        this.M = z4;
        setPadding(0, i10, 0, i11);
        lh.e1 e1Var = this.f24308b;
        if (z4) {
            e1Var.o1(0, i10, 0, i11);
        } else {
            e1Var.setPadding(0, i10, 0, i11);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) e1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i10;
        marginLayoutParams.bottomMargin = -i11;
        this.M = false;
    }

    public final void c(boolean z4) {
        float f10;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.p2 p2Var = this.D;
        if (p2Var != null && this.f24308b.D) {
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
                    spannableString.setSpan(new f51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
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
                        ic M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new jh.f(26, this, z4)), spannableString), i13);
                        M.f25672j = 8000;
                        M.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z4) {
        long j10;
        cn0 cn0Var = this.f24309c;
        cn0Var.q(0, cn0Var.f24027c.f24312r);
        if (!TextUtils.isEmpty(this.H)) {
            int i10 = this.d;
            if (!DownloadController.getInstance(i10).downloadingFiles.isEmpty() || !DownloadController.getInstance(i10).recentDownloadingFiles.isEmpty()) {
                this.f24307a.setStickerType(1);
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                FileLoader.getInstance(this.d).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(this.d).getRecentLoadingFiles(arrayList2);
                String lowerCase = this.H.toLowerCase();
                boolean equals = lowerCase.equals(this.I);
                this.I = lowerCase;
                Utilities.searchQueue.cancelRunnable(this.J);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                wm0 wm0Var = new wm0(this, arrayList, lowerCase, arrayList2);
                this.J = wm0Var;
                if (equals) {
                    j10 = 0;
                } else {
                    j10 = 300;
                }
                dispatchQueue.postRunnable(wm0Var, j10);
                this.f24311n.clear();
                this.h.clear();
                if (!equals) {
                    this.f24307a.e(true, true);
                    e(this.h, this.f24311n, z4);
                    return;
                }
                return;
            }
        }
        if (this.f24312r == 0) {
            this.K.b(0);
        }
        if (this.L) {
            this.h.clear();
            this.f24311n.clear();
        }
        FileLoader.getInstance(this.d).getCurrentLoadingFiles(this.h);
        FileLoader.getInstance(this.d).getRecentLoadingFiles(this.f24311n);
        for (int i11 = 0; i11 < this.e.size(); i11++) {
            ((MessageObject) this.e.get(i11)).setQuery(null);
        }
        for (int i12 = 0; i12 < this.f24310f.size(); i12++) {
            ((MessageObject) this.f24310f.get(i12)).setQuery(null);
        }
        this.I = null;
        e(this.h, this.f24311n, z4);
        if (this.f24312r == 0) {
            this.f24307a.e(false, false);
            this.f24307a.d.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.f24307a.e.setVisibility(8);
        }
        this.f24307a.setStickerType(9);
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
        f2.l1 T;
        cn0 cn0Var = this.f24309c;
        if (z4) {
            int i10 = this.f24313s;
            int i11 = this.v;
            int i12 = this.f24314w;
            int i13 = this.f24315x;
            int i14 = this.f24316y;
            int i15 = this.B;
            int i16 = this.f24312r;
            ArrayList arrayList3 = new ArrayList(this.e);
            ArrayList arrayList4 = new ArrayList(this.f24310f);
            f(arrayList, arrayList2);
            f2.q.c(new ym0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).b(cn0Var);
            int i17 = 0;
            while (true) {
                lh.e1 e1Var = this.f24308b;
                if (i17 < e1Var.getChildCount()) {
                    View childAt = e1Var.getChildAt(i17);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = e1Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.u3) {
                            cn0Var.v(T, R);
                        } else if (childAt instanceof zm0) {
                            org.telegram.ui.Cells.i7 i7Var = ((zm0) childAt).f31383a;
                            i7Var.f(true);
                            int id2 = i7Var.getMessage().getId();
                            long dialogId = i7Var.getMessage().getDialogId();
                            org.telegram.ui.l10 l10Var = this.G;
                            l10Var.f35872a = dialogId;
                            l10Var.f35873b = id2;
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
            cn0Var.l();
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.e;
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
        ArrayList arrayList4 = this.f24310f;
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
        this.f24312r = 0;
        this.f24313s = -1;
        this.v = -1;
        this.f24314w = -1;
        this.f24315x = -1;
        this.f24316y = -1;
        this.B = -1;
        this.E = false;
        if (!arrayList3.isEmpty()) {
            int i13 = this.f24312r;
            int i14 = i13 + 1;
            this.f24312r = i14;
            this.f24313s = i13;
            this.v = i14;
            int size3 = arrayList3.size() + i14;
            this.f24312r = size3;
            this.f24314w = size3;
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
            int i15 = this.f24312r;
            int i16 = i15 + 1;
            this.f24312r = i16;
            this.f24315x = i15;
            this.f24316y = i16;
            int size4 = arrayList4.size() + i16;
            this.f24312r = size4;
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
            Utilities.searchQueue.postRunnable(new cc0(this, 20));
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
