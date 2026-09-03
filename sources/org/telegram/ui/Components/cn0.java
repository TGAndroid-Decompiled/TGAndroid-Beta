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
public final class cn0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public final Activity C;
    public final org.telegram.ui.ActionBar.p2 D;
    public boolean E;
    public org.telegram.ui.t10 F;
    public final org.telegram.ui.m10 G;
    public String H;
    public String I;
    public vm0 J;
    public final yk0 K;
    public boolean L;
    public boolean M;
    public final zw0 f23973a;
    public final lh.e1 f23974b;
    public final bn0 f23975c;
    public final int d;
    public final ArrayList e;
    public final ArrayList f23976f;
    public final ArrayList h;
    public final ArrayList f23977n;
    public int f23978r;
    public int f23979s;
    public int v;
    public int f23980w;
    public int f23981x;
    public int f23982y;

    public cn0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        super(p2Var.getParentActivity());
        bn0 bn0Var = new bn0(this);
        this.f23975c = bn0Var;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.e = arrayList;
        this.f23976f = new ArrayList();
        this.h = new ArrayList();
        this.f23977n = new ArrayList();
        this.f23979s = -1;
        this.v = -1;
        this.f23980w = -1;
        this.f23981x = -1;
        this.f23982y = -1;
        this.B = -1;
        this.G = new org.telegram.ui.m10(0, 0L);
        this.D = p2Var;
        this.C = p2Var.getParentActivity();
        this.d = i10;
        lh.e1 e1Var = new lh.e1(this, getContext(), 17);
        this.f23974b = e1Var;
        new f2.e0(new oh.f(this, 3)).d(e1Var);
        addView(e1Var);
        p2Var.getParentActivity();
        e1Var.setLayoutManager(new org.telegram.ui.k(8));
        e1Var.setAdapter(bn0Var);
        e1Var.setOnScrollListener(new mb0(this, 4));
        f2.l lVar = new f2.l();
        lVar.C = false;
        lVar.f5807m = false;
        e1Var.setItemAnimator(lVar);
        e1Var.setOnItemClickListener(new wm0(this, i10, 0));
        e1Var.setOnItemLongClickListener(new ev(this, 16));
        this.K = new yk0(e1Var, true);
        u00 u00Var = new u00(getContext(), null);
        addView(u00Var);
        u00Var.setUseHeaderOffset(true);
        u00Var.setViewType(3);
        u00Var.setVisibility(8);
        zw0 zw0Var = new zw0(getContext(), u00Var, 1, null);
        this.f23973a = zw0Var;
        addView(zw0Var);
        e1Var.setEmptyView(zw0Var);
        FileLoader.getInstance(i10).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        lh.e1 e1Var;
        MessageObject message;
        int i10 = this.d;
        if (!UserConfig.getInstance(i10).isPremium() && (e1Var = this.f23974b) != null) {
            for (int i11 = 0; i11 < e1Var.getChildCount(); i11++) {
                try {
                    View childAt = e1Var.getChildAt(i11);
                    if ((childAt instanceof ym0) && (message = ((ym0) childAt).f31054a.getMessage()) != null) {
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
        lh.e1 e1Var = this.f23974b;
        if (z4) {
            e1Var.n1(0, i10, 0, i11);
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
        if (p2Var != null && this.f23974b.D) {
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
                        M.f25671j = 8000;
                        M.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z4) {
        long j10;
        bn0 bn0Var = this.f23975c;
        bn0Var.q(0, bn0Var.f23724c.f23978r);
        if (!TextUtils.isEmpty(this.H)) {
            int i10 = this.d;
            if (!DownloadController.getInstance(i10).downloadingFiles.isEmpty() || !DownloadController.getInstance(i10).recentDownloadingFiles.isEmpty()) {
                this.f23973a.setStickerType(1);
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                FileLoader.getInstance(this.d).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(this.d).getRecentLoadingFiles(arrayList2);
                String lowerCase = this.H.toLowerCase();
                boolean equals = lowerCase.equals(this.I);
                this.I = lowerCase;
                Utilities.searchQueue.cancelRunnable(this.J);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                vm0 vm0Var = new vm0(this, arrayList, lowerCase, arrayList2);
                this.J = vm0Var;
                if (equals) {
                    j10 = 0;
                } else {
                    j10 = 300;
                }
                dispatchQueue.postRunnable(vm0Var, j10);
                this.f23977n.clear();
                this.h.clear();
                if (!equals) {
                    this.f23973a.e(true, true);
                    e(this.h, this.f23977n, z4);
                    return;
                }
                return;
            }
        }
        if (this.f23978r == 0) {
            this.K.b(0);
        }
        if (this.L) {
            this.h.clear();
            this.f23977n.clear();
        }
        FileLoader.getInstance(this.d).getCurrentLoadingFiles(this.h);
        FileLoader.getInstance(this.d).getRecentLoadingFiles(this.f23977n);
        for (int i11 = 0; i11 < this.e.size(); i11++) {
            ((MessageObject) this.e.get(i11)).setQuery(null);
        }
        for (int i12 = 0; i12 < this.f23976f.size(); i12++) {
            ((MessageObject) this.f23976f.get(i12)).setQuery(null);
        }
        this.I = null;
        e(this.h, this.f23977n, z4);
        if (this.f23978r == 0) {
            this.f23973a.e(false, false);
            this.f23973a.d.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.f23973a.e.setVisibility(8);
        }
        this.f23973a.setStickerType(9);
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
        bn0 bn0Var = this.f23975c;
        if (z4) {
            int i10 = this.f23979s;
            int i11 = this.v;
            int i12 = this.f23980w;
            int i13 = this.f23981x;
            int i14 = this.f23982y;
            int i15 = this.B;
            int i16 = this.f23978r;
            ArrayList arrayList3 = new ArrayList(this.e);
            ArrayList arrayList4 = new ArrayList(this.f23976f);
            f(arrayList, arrayList2);
            f2.q.c(new xm0(this, i16, i10, i13, i11, i12, arrayList3, i14, i15, arrayList4), true).b(bn0Var);
            int i17 = 0;
            while (true) {
                lh.e1 e1Var = this.f23974b;
                if (i17 < e1Var.getChildCount()) {
                    View childAt = e1Var.getChildAt(i17);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = e1Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.t3) {
                            bn0Var.v(T, R);
                        } else if (childAt instanceof ym0) {
                            org.telegram.ui.Cells.h7 h7Var = ((ym0) childAt).f31054a;
                            h7Var.f(true);
                            int id2 = h7Var.getMessage().getId();
                            long dialogId = h7Var.getMessage().getDialogId();
                            org.telegram.ui.m10 m10Var = this.G;
                            m10Var.f35953a = dialogId;
                            m10Var.f35954b = id2;
                            h7Var.b(this.F.b(m10Var), true);
                        }
                    }
                    i17++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            bn0Var.l();
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
        ArrayList arrayList4 = this.f23976f;
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
        this.f23978r = 0;
        this.f23979s = -1;
        this.v = -1;
        this.f23980w = -1;
        this.f23981x = -1;
        this.f23982y = -1;
        this.B = -1;
        this.E = false;
        if (!arrayList3.isEmpty()) {
            int i13 = this.f23978r;
            int i14 = i13 + 1;
            this.f23978r = i14;
            this.f23979s = i13;
            this.v = i14;
            int size3 = arrayList3.size() + i14;
            this.f23978r = size3;
            this.f23980w = size3;
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
            int i15 = this.f23978r;
            int i16 = i15 + 1;
            this.f23978r = i16;
            this.f23981x = i15;
            this.f23982y = i16;
            int size4 = arrayList4.size() + i16;
            this.f23978r = size4;
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
            Utilities.searchQueue.postRunnable(new dc0(this, 20));
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

    public void setUiCallback(org.telegram.ui.t10 t10Var) {
        this.F = t10Var;
    }
}
