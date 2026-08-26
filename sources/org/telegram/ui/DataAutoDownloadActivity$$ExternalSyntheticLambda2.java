package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.MaxFileSizeCell;
import org.telegram.ui.Cells.TextCheckBoxCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class DataAutoDownloadActivity$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final KeyEvent.Callback[] f$2;
    public final int f$3;
    public final Object f$4;
    public final Object f$5;
    public final Object f$6;

    public DataAutoDownloadActivity$$ExternalSyntheticLambda2(DataAutoDownloadActivity dataAutoDownloadActivity, TextCheckBoxCell textCheckBoxCell, TextCheckBoxCell[] textCheckBoxCellArr, int i, MaxFileSizeCell[] maxFileSizeCellArr, TextCheckCell[] textCheckCellArr, AnimatorSet[] animatorSetArr) {
        this.f$0 = dataAutoDownloadActivity;
        this.f$1 = textCheckBoxCell;
        this.f$2 = textCheckBoxCellArr;
        this.f$3 = i;
        this.f$4 = maxFileSizeCellArr;
        this.f$5 = textCheckCellArr;
        this.f$6 = animatorSetArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) this.f$0;
                dataAutoDownloadActivity.getClass();
                if (view.isEnabled()) {
                    TextCheckBoxCell textCheckBoxCell = (TextCheckBoxCell) this.f$1;
                    boolean z = true;
                    textCheckBoxCell.setChecked(!textCheckBoxCell.checkBox.isChecked);
                    int i = 0;
                    while (true) {
                        TextCheckBoxCell[] textCheckBoxCellArr = (TextCheckBoxCell[]) this.f$2;
                        if (i >= 4) {
                            z = false;
                        } else if (!textCheckBoxCellArr[i].checkBox.isChecked) {
                            i++;
                        }
                    }
                    if (this.f$3 == dataAutoDownloadActivity.videosRow) {
                        MaxFileSizeCell[] maxFileSizeCellArr = (MaxFileSizeCell[]) this.f$4;
                        if (maxFileSizeCellArr[0].isEnabled() != z) {
                            ArrayList arrayList = new ArrayList();
                            maxFileSizeCellArr[0].setEnabled(arrayList, z);
                            if (maxFileSizeCellArr[0].getSize() > 2097152) {
                                ((TextCheckCell[]) this.f$5)[0].setEnabled(arrayList, z);
                            }
                            AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f$6;
                            AnimatorSet animatorSet = animatorSetArr[0];
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                animatorSetArr[0] = null;
                            }
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSetArr[0] = animatorSet2;
                            animatorSet2.playTogether(arrayList);
                            animatorSetArr[0].addListener(new PhotoViewer$41$1(animatorSetArr, 5));
                            animatorSetArr[0].setDuration(150L);
                            animatorSetArr[0].start();
                        }
                    }
                    break;
                }
                break;
            default:
                final ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) this.f$0;
                if (!buttonWithCounterView.loading) {
                    buttonWithCounterView.setLoading(true);
                    TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.f$1;
                    if (starsSubscription.chat_invite_hash != null) {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i2 = this.f$3;
                        ConnectionsManager.getInstance(i2).sendRequest(tL_messages_checkChatInvite, new GroupCallSheet$$ExternalSyntheticLambda0(buttonWithCounterView, (BottomSheet[]) this.f$2, (Theme.ResourcesProvider) this.f$4, i2, tL_messages_checkChatInvite, 12));
                    } else if (starsSubscription.invoice_slug != null) {
                        ((boolean[]) this.f$5)[0] = true;
                        Browser.openUrl((Activity) this.f$6, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new Browser.Progress() {
                            public AnonymousClass14() {
                            }

                            @Override
                            public final void end() {
                                buttonWithCounterView.setLoading(false);
                            }
                        }, null, false, true, false);
                    }
                    break;
                }
                break;
        }
    }

    public DataAutoDownloadActivity$$ExternalSyntheticLambda2(ButtonWithCounterView buttonWithCounterView, TL_stars.StarsSubscription starsSubscription, int i, BottomSheet[] bottomSheetArr, Theme.ResourcesProvider resourcesProvider, boolean[] zArr, Activity activity) {
        this.f$0 = buttonWithCounterView;
        this.f$1 = starsSubscription;
        this.f$3 = i;
        this.f$2 = bottomSheetArr;
        this.f$4 = resourcesProvider;
        this.f$5 = zArr;
        this.f$6 = activity;
    }
}
