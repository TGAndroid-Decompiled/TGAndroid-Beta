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
public final class gm0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public final Activity B;
    public final org.telegram.ui.ActionBar.o2 C;
    public boolean D;
    public org.telegram.ui.e10 E;
    public final org.telegram.ui.x00 F;
    public String G;
    public String H;
    public zl0 I;
    public final dk0 J;
    public boolean K;
    public boolean L;
    public final gw0 f28808a;
    public final gh.f1 f28809b;
    public final fm0 f28810c;
    public final int d;
    public final ArrayList f28811e;
    public final ArrayList f28812f;
    public final ArrayList h;
    public final ArrayList f28813n;
    public int f28814r;
    public int f28815s;
    public int v;
    public int f28816w;
    public int f28817x;
    public int f28818y;

    public gm0(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        super(o2Var.getParentActivity());
        fm0 fm0Var = new fm0(this);
        this.f28810c = fm0Var;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        this.f28811e = arrayList;
        this.f28812f = new ArrayList();
        this.h = new ArrayList();
        this.f28813n = new ArrayList();
        this.f28815s = -1;
        this.v = -1;
        this.f28816w = -1;
        this.f28817x = -1;
        this.f28818y = -1;
        this.A = -1;
        this.F = new org.telegram.ui.x00(0, 0L);
        this.C = o2Var;
        this.B = o2Var.getParentActivity();
        this.d = i9;
        gh.f1 f1Var = new gh.f1(this, getContext(), 19);
        this.f28809b = f1Var;
        new f2.h0(new jh.f(this, 3)).d(f1Var);
        addView(f1Var);
        o2Var.getParentActivity();
        f1Var.setLayoutManager(new of.y(9));
        f1Var.setAdapter(fm0Var);
        f1Var.setOnScrollListener(new kn(this, 10));
        f2.n nVar = new f2.n();
        nVar.C = false;
        nVar.f5532m = false;
        f1Var.setItemAnimator(nVar);
        f1Var.setOnItemClickListener(new am0(this, i9, 0));
        f1Var.setOnItemLongClickListener(new wu(this, 16));
        this.J = new dk0(f1Var, true);
        e00 e00Var = new e00(getContext(), null);
        addView(e00Var);
        e00Var.setUseHeaderOffset(true);
        e00Var.setViewType(3);
        e00Var.setVisibility(8);
        gw0 gw0Var = new gw0(getContext(), e00Var, 1, null);
        this.f28808a = gw0Var;
        addView(gw0Var);
        f1Var.setEmptyView(gw0Var);
        FileLoader.getInstance(i9).getCurrentLoadingFiles(arrayList);
    }

    public final void a() {
        gh.f1 f1Var;
        MessageObject message;
        int i9 = this.d;
        if (!UserConfig.getInstance(i9).isPremium() && (f1Var = this.f28809b) != null) {
            for (int i10 = 0; i10 < f1Var.getChildCount(); i10++) {
                try {
                    View childAt = f1Var.getChildAt(i10);
                    if ((childAt instanceof cm0) && (message = ((cm0) childAt).f27513a.getMessage()) != null) {
                        if (FileLoader.getInstance(i9).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(false);
                        } else if (FileLoader.getInstance(i9).checkLoadCaughtPremiumFloodWait(message.getFileName())) {
                            c(true);
                        } else {
                            continue;
                        }
                        return;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    public final void b(int i9, int i10, boolean z10) {
        setClipToPadding(false);
        this.L = z10;
        setPadding(0, i9, 0, i10);
        gh.f1 f1Var = this.f28809b;
        if (z10) {
            f1Var.o1(0, i9, 0, i10);
        } else {
            f1Var.setPadding(0, i9, 0, i10);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f1Var.getLayoutParams();
        marginLayoutParams.topMargin = -i9;
        marginLayoutParams.bottomMargin = -i10;
        this.L = false;
    }

    public final void c(boolean z10) {
        float f10;
        int i9;
        int i10;
        org.telegram.ui.ActionBar.o2 o2Var = this.C;
        if (o2Var != null && this.f28809b.C) {
            long currentTimeMillis = System.currentTimeMillis();
            int i11 = this.d;
            if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= MessagesController.getInstance(i11).uploadPremiumSpeedupNotifyPeriod * 1000) {
                ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
                if (!UserConfig.getInstance(i11).isPremium() && !MessagesController.getInstance(i11).premiumFeaturesBlocked()) {
                    if (z10) {
                        f10 = MessagesController.getInstance(i11).uploadPremiumSpeedupUpload;
                    } else {
                        f10 = MessagesController.getInstance(i11).uploadPremiumSpeedupDownload;
                    }
                    SpannableString spannableString = new SpannableString(Double.toString(Math.round(f10 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                    spannableString.setSpan(new i41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    if (!o2Var.hasStoryViewer()) {
                        oc a02 = oc.a0(o2Var);
                        int i12 = R.raw.speed_limit;
                        if (z10) {
                            i9 = R.string.UploadSpeedLimited;
                        } else {
                            i9 = R.string.DownloadSpeedLimited;
                        }
                        String string = LocaleController.getString(i9);
                        if (z10) {
                            i10 = R.string.UploadSpeedLimitedMessage;
                        } else {
                            i10 = R.string.DownloadSpeedLimitedMessage;
                        }
                        gc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i10), new a50(2, this, z10)), spannableString), i12);
                        M.f28737j = 8000;
                        M.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z10) {
        long j10;
        fm0 fm0Var = this.f28810c;
        fm0Var.q(0, fm0Var.f28513c.f28814r);
        if (!TextUtils.isEmpty(this.G)) {
            int i9 = this.d;
            if (!DownloadController.getInstance(i9).downloadingFiles.isEmpty() || !DownloadController.getInstance(i9).recentDownloadingFiles.isEmpty()) {
                this.f28808a.setStickerType(1);
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                FileLoader.getInstance(this.d).getCurrentLoadingFiles(arrayList);
                FileLoader.getInstance(this.d).getRecentLoadingFiles(arrayList2);
                String lowerCase = this.G.toLowerCase();
                boolean equals = lowerCase.equals(this.H);
                this.H = lowerCase;
                Utilities.searchQueue.cancelRunnable(this.I);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                zl0 zl0Var = new zl0(this, arrayList, lowerCase, arrayList2);
                this.I = zl0Var;
                if (equals) {
                    j10 = 0;
                } else {
                    j10 = 300;
                }
                dispatchQueue.postRunnable(zl0Var, j10);
                this.f28813n.clear();
                this.h.clear();
                if (!equals) {
                    this.f28808a.e(true, true);
                    e(this.h, this.f28813n, z10);
                    return;
                }
                return;
            }
        }
        if (this.f28814r == 0) {
            this.J.b(0);
        }
        if (this.K) {
            this.h.clear();
            this.f28813n.clear();
        }
        FileLoader.getInstance(this.d).getCurrentLoadingFiles(this.h);
        FileLoader.getInstance(this.d).getRecentLoadingFiles(this.f28813n);
        for (int i10 = 0; i10 < this.f28811e.size(); i10++) {
            ((MessageObject) this.f28811e.get(i10)).setQuery(null);
        }
        for (int i11 = 0; i11 < this.f28812f.size(); i11++) {
            ((MessageObject) this.f28812f.get(i11)).setQuery(null);
        }
        this.H = null;
        e(this.h, this.f28813n, z10);
        if (this.f28814r == 0) {
            this.f28808a.e(false, false);
            this.f28808a.d.setText(LocaleController.getString(R.string.SearchEmptyViewDownloads));
            this.f28808a.f28885e.setVisibility(8);
        }
        this.f28808a.setStickerType(9);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.onDownloadingFilesChanged) {
            if (getVisibility() == 0) {
                DownloadController.getInstance(this.d).clearUnviewedDownloads();
            }
            d(true);
        } else if (i9 == NotificationCenter.premiumFloodWaitReceived) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        f2.q1 T;
        fm0 fm0Var = this.f28810c;
        if (z10) {
            int i9 = this.f28815s;
            int i10 = this.v;
            int i11 = this.f28816w;
            int i12 = this.f28817x;
            int i13 = this.f28818y;
            int i14 = this.A;
            int i15 = this.f28814r;
            ArrayList arrayList3 = new ArrayList(this.f28811e);
            ArrayList arrayList4 = new ArrayList(this.f28812f);
            f(arrayList, arrayList2);
            f2.s.c(new bm0(this, i15, i9, i12, i10, i11, arrayList3, i13, i14, arrayList4), true).b(fm0Var);
            int i16 = 0;
            while (true) {
                gh.f1 f1Var = this.f28809b;
                if (i16 < f1Var.getChildCount()) {
                    View childAt = f1Var.getChildAt(i16);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = f1Var.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof org.telegram.ui.Cells.v3) {
                            fm0Var.v(T, R);
                        } else if (childAt instanceof cm0) {
                            org.telegram.ui.Cells.i7 i7Var = ((cm0) childAt).f27513a;
                            i7Var.f(true);
                            int id2 = i7Var.getMessage().getId();
                            long dialogId = i7Var.getMessage().getDialogId();
                            org.telegram.ui.x00 x00Var = this.F;
                            x00Var.f44299a = dialogId;
                            x00Var.f44300b = id2;
                            i7Var.b(this.E.b(x00Var), true);
                        }
                    }
                    i16++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            fm0Var.l();
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.f28811e;
        arrayList3.clear();
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            MessageObject messageObject = (MessageObject) obj;
            if (!messageObject.isRoundVideo() && !messageObject.isVoice()) {
                arrayList3.add(messageObject);
            }
        }
        ArrayList arrayList4 = this.f28812f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            MessageObject messageObject2 = (MessageObject) obj2;
            if (!messageObject2.isRoundVideo() && !messageObject2.isVoice()) {
                arrayList4.add(messageObject2);
            }
        }
        this.f28814r = 0;
        this.f28815s = -1;
        this.v = -1;
        this.f28816w = -1;
        this.f28817x = -1;
        this.f28818y = -1;
        this.A = -1;
        this.D = false;
        if (!arrayList3.isEmpty()) {
            int i12 = this.f28814r;
            int i13 = i12 + 1;
            this.f28814r = i13;
            this.f28815s = i12;
            this.v = i13;
            int size3 = arrayList3.size() + i13;
            this.f28814r = size3;
            this.f28816w = size3;
            while (true) {
                if (i9 >= arrayList3.size()) {
                    break;
                } else if (FileLoader.getInstance(this.d).isLoadingFile(((MessageObject) arrayList3.get(i9)).getFileName())) {
                    this.D = true;
                    break;
                } else {
                    i9++;
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            int i14 = this.f28814r;
            int i15 = i14 + 1;
            this.f28814r = i15;
            this.f28817x = i14;
            this.f28818y = i15;
            int size4 = arrayList4.size() + i15;
            this.f28814r = size4;
            this.A = size4;
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
        if (!this.K) {
            this.K = true;
            Utilities.searchQueue.postRunnable(new ib0(this, 20));
        }
        d(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = this.d;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.premiumFloodWaitReceived);
    }

    @Override
    public final void requestLayout() {
        if (this.L) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(org.telegram.ui.e10 e10Var) {
        this.E = e10Var;
    }
}
