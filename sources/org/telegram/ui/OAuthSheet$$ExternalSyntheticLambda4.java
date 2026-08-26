package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.internal.clearcut.zze;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class OAuthSheet$$ExternalSyntheticLambda4 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;

    public OAuthSheet$$ExternalSyntheticLambda4(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onClick(View view) {
        int adapterPosition;
        final int i = 4;
        final int i2 = 2;
        final int i3 = 0;
        final int i4 = 1;
        switch (this.$r8$classId) {
            case 0:
                TextCheckCell textCheckCell = (TextCheckCell) this.f$0;
                textCheckCell.setChecked(!textCheckCell.checkBox.isChecked);
                break;
            case 1:
                GroupColorActivity.this.openBoostDialog(19);
                break;
            case 2:
                GroupCreateActivity groupCreateActivity = GroupCreateActivity.this;
                groupCreateActivity.selectedPremium = null;
                groupCreateActivity.selectedContacts.clear();
                GroupCreateActivity.AnonymousClass3 anonymousClass3 = groupCreateActivity.spansContainer;
                anonymousClass3.spansContainer.removeAllSpans();
                GroupCreateActivity groupCreateActivity2 = GroupCreateActivity.this;
                if (groupCreateActivity2.buttonsContainer != null) {
                    groupCreateActivity2.animatorCallButtonsVisible.setValue(!groupCreateActivity2.selectedContacts.isEmpty(), true);
                }
                groupCreateActivity.checkVisibleRows();
                groupCreateActivity.updateEditTextHint();
                break;
            case 3:
                GroupStickersActivity.access$3100(GroupStickersActivity.this, null);
                break;
            case 4:
                ((InviteContactsActivity) this.f$0).lambda$createView$1$4$1();
                break;
            case 5:
                ((LaunchActivity) this.f$0).lambda$showLanguageAlertInternal$171(view);
                break;
            case 6:
                final LoginActivity.LoginActivityRecoverView loginActivityRecoverView = (LoginActivity.LoginActivityRecoverView) this.f$0;
                LoginActivity loginActivity = LoginActivity.this;
                AlertDialog.Builder builder = new AlertDialog.Builder(loginActivity.getParentActivity(), 0, null);
                String string = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                builder.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog2, int i5) {
                        switch (i3) {
                            case 0:
                                LoginActivity.LoginActivityRecoverView loginActivityRecoverView2 = loginActivityRecoverView;
                                loginActivityRecoverView2.getClass();
                                LoginActivity.this.setPage(6, true, new Bundle(), true);
                                break;
                            default:
                                LoginActivity.LoginActivityRecoverView loginActivityRecoverView3 = loginActivityRecoverView;
                                LoginActivity.this.tryResetAccount(loginActivityRecoverView3.requestPhone, loginActivityRecoverView3.phoneHash, loginActivityRecoverView3.phoneCode);
                                break;
                        }
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.ResetAccount), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog2, int i5) {
                        switch (i4) {
                            case 0:
                                LoginActivity.LoginActivityRecoverView loginActivityRecoverView2 = loginActivityRecoverView;
                                loginActivityRecoverView2.getClass();
                                LoginActivity.this.setPage(6, true, new Bundle(), true);
                                break;
                            default:
                                LoginActivity.LoginActivityRecoverView loginActivityRecoverView3 = loginActivityRecoverView;
                                LoginActivity.this.tryResetAccount(loginActivityRecoverView3.requestPhone, loginActivityRecoverView3.phoneHash, loginActivityRecoverView3.phoneCode);
                                break;
                        }
                    }
                });
                Dialog dialogShowDialog = loginActivity.showDialog(alertDialog);
                if (dialogShowDialog != null) {
                    dialogShowDialog.setCanceledOnTouchOutside(false);
                    dialogShowDialog.setCancelable(false);
                }
                break;
            case 7:
                LoginActivity.LoginActivityResetWaitView loginActivityResetWaitView = (LoginActivity.LoginActivityResetWaitView) this.f$0;
                LoginActivity loginActivity2 = LoginActivity.this;
                if (loginActivity2.radialProgressView.getTag() == null) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(loginActivity2.getParentActivity(), 0, null);
                    String string2 = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    AlertDialog alertDialog2 = builder2.alertDialog;
                    alertDialog2.title = string2;
                    alertDialog2.message = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    builder2.setPositiveButton(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new PhotoViewer$$ExternalSyntheticLambda115(loginActivityResetWaitView, 6));
                    builder2.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                    loginActivity2.showDialog(alertDialog2);
                    break;
                }
                break;
            case 8:
                final LoginActivity.LoginActivitySetupEmail loginActivitySetupEmail = (LoginActivity.LoginActivitySetupEmail) this.f$0;
                loginActivitySetupEmail.getClass();
                NotificationCenter.getGlobalInstance().addObserver(new NotificationCenter.NotificationCenterDelegate() {
                    public AnonymousClass2() {
                    }

                    @Override
                    public final void didReceivedNotification(int i5, int i6, Object... objArr) {
                        LoginActivitySetupEmail loginActivitySetupEmail2 = LoginActivitySetupEmail.this;
                        int iIntValue = ((Integer) objArr[0]).intValue();
                        ((Integer) objArr[1]).getClass();
                        Intent intent = (Intent) objArr[2];
                        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
                        if (iIntValue == 200) {
                            try {
                                loginActivitySetupEmail2.googleAccount = (GoogleSignInAccount) GoogleSignIn.getSignedInAccountFromIntent(intent).getResult(ApiException.class);
                                loginActivitySetupEmail2.onNextPressed(null);
                            } catch (ApiException e) {
                                FileLog.e(e);
                            }
                        }
                    }
                }, NotificationCenter.onActivityResultReceived);
                Context context = loginActivitySetupEmail.getContext();
                HashSet hashSet = new HashSet();
                HashMap map = new HashMap();
                String str = BuildVars.GOOGLE_AUTH_CLIENT_ID;
                zzah.checkNotEmpty(str);
                hashSet.add(GoogleSignInOptions.zab);
                if (hashSet.contains(GoogleSignInOptions.zae)) {
                    Scope scope = GoogleSignInOptions.zad;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.zac);
                zze client = GoogleSignIn.getClient(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, map, null));
                client.signOut().addOnCompleteListener(new DialogsActivity$$ExternalSyntheticLambda89(26, loginActivitySetupEmail, client));
                break;
            case 9:
                final ManageLinksActivity.LinkCell linkCell = (ManageLinksActivity.LinkCell) this.f$0;
                if (linkCell.invite != null) {
                    ManageLinksActivity manageLinksActivity = ManageLinksActivity.this;
                    View view2 = manageLinksActivity.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions((ViewGroup) view2, null, linkCell);
                        if (linkCell.invite.revoked) {
                            itemOptionsMakeOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i3) {
                                        case 0:
                                            final ManageLinksActivity.LinkCell linkCell2 = linkCell;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = linkCell2.invite;
                                            AlertDialog.Builder builder3 = new AlertDialog.Builder(ManageLinksActivity.this.getParentActivity(), 0, null);
                                            String string3 = LocaleController.getString(R.string.DeleteLink);
                                            AlertDialog alertDialog3 = builder3.alertDialog;
                                            alertDialog3.title = string3;
                                            alertDialog3.message = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i5 = 1;
                                            builder3.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                                                @Override
                                                public final void onClick(AlertDialog alertDialog4, int i6) {
                                                    switch (i5) {
                                                        case 0:
                                                            ManageLinksActivity.this.revokeLink(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ManageLinksActivity.this.deleteLink(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            ArticleViewer.IBlock.CC.m(R.string.Cancel, builder3, (AlertDialog.OnButtonClickListener) null);
                                            break;
                                        case 1:
                                            ManageLinksActivity.LinkCell linkCell3 = linkCell;
                                            linkCell3.getClass();
                                            try {
                                                if (linkCell3.invite.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", linkCell3.invite.link));
                                                    BulletinFactory.of(ManageLinksActivity.this).createCopyLinkBulletin(false).show();
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            ManageLinksActivity.LinkCell linkCell4 = linkCell;
                                            ManageLinksActivity manageLinksActivity2 = ManageLinksActivity.this;
                                            try {
                                                if (linkCell4.invite.link != null) {
                                                    Context context2 = linkCell4.getContext();
                                                    String str2 = linkCell4.invite.link;
                                                    manageLinksActivity2.showDialog(new ShareAlert(context2, str2, str2, manageLinksActivity2.getResourceProvider()) {
                                                        public AnonymousClass1(Context context3, String str3, String str4, Theme.ResourcesProvider resourcesProvider) {
                                                            super(context3, str4, str4, resourcesProvider);
                                                        }

                                                        @Override
                                                        public final void onSend(LongSparseArray longSparseArray, int i6, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                                                            String string4;
                                                            if (z) {
                                                                LinkCell linkCell5 = LinkCell.this;
                                                                if (longSparseArray == null || longSparseArray.size() != 1) {
                                                                    string4 = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i6, new Object[0]));
                                                                } else {
                                                                    long j = ((TLRPC.Dialog) longSparseArray.valueAt(0)).id;
                                                                    string4 = (j == 0 || j == ManageLinksActivity.this.getUserConfig().getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, ManageLinksActivity.this.getMessagesController().getPeerName(j, true));
                                                                }
                                                                Bulletin bulletinCreateSimpleBulletinWithIconSize = BulletinFactory.of(ManageLinksActivity.this).createSimpleBulletinWithIconSize(R.raw.forward, 36, AndroidUtilities.replaceTags(string4));
                                                                bulletinCreateSimpleBulletinWithIconSize.hideAfterBottomSheet = false;
                                                                bulletinCreateSimpleBulletinWithIconSize.show(true);
                                                            }
                                                        }
                                                    });
                                                }
                                            } catch (Exception e2) {
                                                FileLog.e(e2);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            ManageLinksActivity.LinkCell linkCell5 = linkCell;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = linkCell5.invite;
                                            ManageLinksActivity manageLinksActivity3 = ManageLinksActivity.this;
                                            LinkEditActivity linkEditActivity = new LinkEditActivity(1, manageLinksActivity3.currentChatId);
                                            linkEditActivity.callback = manageLinksActivity3.linkEditActivityCallback;
                                            linkEditActivity.setInviteToEdit(tL_chatInviteExported2);
                                            manageLinksActivity3.presentFragment(linkEditActivity);
                                            break;
                                        default:
                                            final ManageLinksActivity.LinkCell linkCell6 = linkCell;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = linkCell6.invite;
                                            AlertDialog.Builder builder4 = new AlertDialog.Builder(ManageLinksActivity.this.getParentActivity(), 0, null);
                                            String string4 = LocaleController.getString(R.string.RevokeAlert);
                                            AlertDialog alertDialog4 = builder4.alertDialog;
                                            alertDialog4.message = string4;
                                            alertDialog4.title = LocaleController.getString(R.string.RevokeLink);
                                            final int i6 = 0;
                                            builder4.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new AlertDialog.OnButtonClickListener() {
                                                @Override
                                                public final void onClick(AlertDialog alertDialog5, int i7) {
                                                    switch (i6) {
                                                        case 0:
                                                            ManageLinksActivity.this.revokeLink(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ManageLinksActivity.this.deleteLink(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            ArticleViewer.IBlock.CC.m(R.string.Cancel, builder4, (AlertDialog.OnButtonClickListener) null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            itemOptionsMakeOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i4) {
                                        case 0:
                                            final ManageLinksActivity.LinkCell linkCell2 = linkCell;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = linkCell2.invite;
                                            AlertDialog.Builder builder3 = new AlertDialog.Builder(ManageLinksActivity.this.getParentActivity(), 0, null);
                                            String string3 = LocaleController.getString(R.string.DeleteLink);
                                            AlertDialog alertDialog3 = builder3.alertDialog;
                                            alertDialog3.title = string3;
                                            alertDialog3.message = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i5 = 1;
                                            builder3.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                                                @Override
                                                public final void onClick(AlertDialog alertDialog5, int i7) {
                                                    switch (i5) {
                                                        case 0:
                                                            ManageLinksActivity.this.revokeLink(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ManageLinksActivity.this.deleteLink(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            ArticleViewer.IBlock.CC.m(R.string.Cancel, builder3, (AlertDialog.OnButtonClickListener) null);
                                            break;
                                        case 1:
                                            ManageLinksActivity.LinkCell linkCell3 = linkCell;
                                            linkCell3.getClass();
                                            try {
                                                if (linkCell3.invite.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", linkCell3.invite.link));
                                                    BulletinFactory.of(ManageLinksActivity.this).createCopyLinkBulletin(false).show();
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            ManageLinksActivity.LinkCell linkCell4 = linkCell;
                                            ManageLinksActivity manageLinksActivity2 = ManageLinksActivity.this;
                                            try {
                                                if (linkCell4.invite.link != null) {
                                                    Context context3 = linkCell4.getContext();
                                                    String str4 = linkCell4.invite.link;
                                                    manageLinksActivity2.showDialog(new ShareAlert(context3, str4, str4, manageLinksActivity2.getResourceProvider()) {
                                                        public AnonymousClass1(Context context4, String str5, String str6, Theme.ResourcesProvider resourcesProvider) {
                                                            super(context4, str6, str6, resourcesProvider);
                                                        }

                                                        @Override
                                                        public final void onSend(LongSparseArray longSparseArray, int i6, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                                                            String string4;
                                                            if (z) {
                                                                LinkCell linkCell5 = LinkCell.this;
                                                                if (longSparseArray == null || longSparseArray.size() != 1) {
                                                                    string4 = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i6, new Object[0]));
                                                                } else {
                                                                    long j = ((TLRPC.Dialog) longSparseArray.valueAt(0)).id;
                                                                    string4 = (j == 0 || j == ManageLinksActivity.this.getUserConfig().getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, ManageLinksActivity.this.getMessagesController().getPeerName(j, true));
                                                                }
                                                                Bulletin bulletinCreateSimpleBulletinWithIconSize = BulletinFactory.of(ManageLinksActivity.this).createSimpleBulletinWithIconSize(R.raw.forward, 36, AndroidUtilities.replaceTags(string4));
                                                                bulletinCreateSimpleBulletinWithIconSize.hideAfterBottomSheet = false;
                                                                bulletinCreateSimpleBulletinWithIconSize.show(true);
                                                            }
                                                        }
                                                    });
                                                }
                                            } catch (Exception e2) {
                                                FileLog.e(e2);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            ManageLinksActivity.LinkCell linkCell5 = linkCell;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = linkCell5.invite;
                                            ManageLinksActivity manageLinksActivity3 = ManageLinksActivity.this;
                                            LinkEditActivity linkEditActivity = new LinkEditActivity(1, manageLinksActivity3.currentChatId);
                                            linkEditActivity.callback = manageLinksActivity3.linkEditActivityCallback;
                                            linkEditActivity.setInviteToEdit(tL_chatInviteExported2);
                                            manageLinksActivity3.presentFragment(linkEditActivity);
                                            break;
                                        default:
                                            final ManageLinksActivity.LinkCell linkCell6 = linkCell;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = linkCell6.invite;
                                            AlertDialog.Builder builder4 = new AlertDialog.Builder(ManageLinksActivity.this.getParentActivity(), 0, null);
                                            String string4 = LocaleController.getString(R.string.RevokeAlert);
                                            AlertDialog alertDialog4 = builder4.alertDialog;
                                            alertDialog4.message = string4;
                                            alertDialog4.title = LocaleController.getString(R.string.RevokeLink);
                                            final int i6 = 0;
                                            builder4.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new AlertDialog.OnButtonClickListener() {
                                                @Override
                                                public final void onClick(AlertDialog alertDialog5, int i7) {
                                                    switch (i6) {
                                                        case 0:
                                                            ManageLinksActivity.this.revokeLink(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ManageLinksActivity.this.deleteLink(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            ArticleViewer.IBlock.CC.m(R.string.Cancel, builder4, (AlertDialog.OnButtonClickListener) null);
                                            break;
                                    }
                                }
                            }, false);
                            itemOptionsMakeOptions.add(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i2) {
                                        case 0:
                                            final ManageLinksActivity.LinkCell linkCell2 = linkCell;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = linkCell2.invite;
                                            AlertDialog.Builder builder3 = new AlertDialog.Builder(ManageLinksActivity.this.getParentActivity(), 0, null);
                                            String string3 = LocaleController.getString(R.string.DeleteLink);
                                            AlertDialog alertDialog3 = builder3.alertDialog;
                                            alertDialog3.title = string3;
                                            alertDialog3.message = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i5 = 1;
                                            builder3.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                                                @Override
                                                public final void onClick(AlertDialog alertDialog5, int i7) {
                                                    switch (i5) {
                                                        case 0:
                                                            ManageLinksActivity.this.revokeLink(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ManageLinksActivity.this.deleteLink(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            ArticleViewer.IBlock.CC.m(R.string.Cancel, builder3, (AlertDialog.OnButtonClickListener) null);
                                            break;
                                        case 1:
                                            ManageLinksActivity.LinkCell linkCell3 = linkCell;
                                            linkCell3.getClass();
                                            try {
                                                if (linkCell3.invite.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", linkCell3.invite.link));
                                                    BulletinFactory.of(ManageLinksActivity.this).createCopyLinkBulletin(false).show();
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            ManageLinksActivity.LinkCell linkCell4 = linkCell;
                                            ManageLinksActivity manageLinksActivity2 = ManageLinksActivity.this;
                                            try {
                                                if (linkCell4.invite.link != null) {
                                                    Context context4 = linkCell4.getContext();
                                                    String str6 = linkCell4.invite.link;
                                                    manageLinksActivity2.showDialog(new ShareAlert(context4, str6, str6, manageLinksActivity2.getResourceProvider()) {
                                                        public AnonymousClass1(Context context5, String str7, String str8, Theme.ResourcesProvider resourcesProvider) {
                                                            super(context5, str8, str8, resourcesProvider);
                                                        }

                                                        @Override
                                                        public final void onSend(LongSparseArray longSparseArray, int i6, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                                                            String string4;
                                                            if (z) {
                                                                LinkCell linkCell5 = LinkCell.this;
                                                                if (longSparseArray == null || longSparseArray.size() != 1) {
                                                                    string4 = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i6, new Object[0]));
                                                                } else {
                                                                    long j = ((TLRPC.Dialog) longSparseArray.valueAt(0)).id;
                                                                    string4 = (j == 0 || j == ManageLinksActivity.this.getUserConfig().getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, ManageLinksActivity.this.getMessagesController().getPeerName(j, true));
                                                                }
                                                                Bulletin bulletinCreateSimpleBulletinWithIconSize = BulletinFactory.of(ManageLinksActivity.this).createSimpleBulletinWithIconSize(R.raw.forward, 36, AndroidUtilities.replaceTags(string4));
                                                                bulletinCreateSimpleBulletinWithIconSize.hideAfterBottomSheet = false;
                                                                bulletinCreateSimpleBulletinWithIconSize.show(true);
                                                            }
                                                        }
                                                    });
                                                }
                                            } catch (Exception e2) {
                                                FileLog.e(e2);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            ManageLinksActivity.LinkCell linkCell5 = linkCell;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = linkCell5.invite;
                                            ManageLinksActivity manageLinksActivity3 = ManageLinksActivity.this;
                                            LinkEditActivity linkEditActivity = new LinkEditActivity(1, manageLinksActivity3.currentChatId);
                                            linkEditActivity.callback = manageLinksActivity3.linkEditActivityCallback;
                                            linkEditActivity.setInviteToEdit(tL_chatInviteExported2);
                                            manageLinksActivity3.presentFragment(linkEditActivity);
                                            break;
                                        default:
                                            final ManageLinksActivity.LinkCell linkCell6 = linkCell;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = linkCell6.invite;
                                            AlertDialog.Builder builder4 = new AlertDialog.Builder(ManageLinksActivity.this.getParentActivity(), 0, null);
                                            String string4 = LocaleController.getString(R.string.RevokeAlert);
                                            AlertDialog alertDialog4 = builder4.alertDialog;
                                            alertDialog4.message = string4;
                                            alertDialog4.title = LocaleController.getString(R.string.RevokeLink);
                                            final int i6 = 0;
                                            builder4.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new AlertDialog.OnButtonClickListener() {
                                                @Override
                                                public final void onClick(AlertDialog alertDialog5, int i7) {
                                                    switch (i6) {
                                                        case 0:
                                                            ManageLinksActivity.this.revokeLink(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ManageLinksActivity.this.deleteLink(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            ArticleViewer.IBlock.CC.m(R.string.Cancel, builder4, (AlertDialog.OnButtonClickListener) null);
                                            break;
                                    }
                                }
                            }, false);
                            boolean z = linkCell.invite.permanent;
                            boolean z2 = manageLinksActivity.canEdit;
                            final int i5 = 3;
                            itemOptionsMakeOptions.addIf(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i5) {
                                        case 0:
                                            final ManageLinksActivity.LinkCell linkCell2 = linkCell;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = linkCell2.invite;
                                            AlertDialog.Builder builder3 = new AlertDialog.Builder(ManageLinksActivity.this.getParentActivity(), 0, null);
                                            String string3 = LocaleController.getString(R.string.DeleteLink);
                                            AlertDialog alertDialog3 = builder3.alertDialog;
                                            alertDialog3.title = string3;
                                            alertDialog3.message = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i6 = 1;
                                            builder3.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                                                @Override
                                                public final void onClick(AlertDialog alertDialog5, int i7) {
                                                    switch (i6) {
                                                        case 0:
                                                            ManageLinksActivity.this.revokeLink(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ManageLinksActivity.this.deleteLink(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            ArticleViewer.IBlock.CC.m(R.string.Cancel, builder3, (AlertDialog.OnButtonClickListener) null);
                                            break;
                                        case 1:
                                            ManageLinksActivity.LinkCell linkCell3 = linkCell;
                                            linkCell3.getClass();
                                            try {
                                                if (linkCell3.invite.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", linkCell3.invite.link));
                                                    BulletinFactory.of(ManageLinksActivity.this).createCopyLinkBulletin(false).show();
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            ManageLinksActivity.LinkCell linkCell4 = linkCell;
                                            ManageLinksActivity manageLinksActivity2 = ManageLinksActivity.this;
                                            try {
                                                if (linkCell4.invite.link != null) {
                                                    Context context5 = linkCell4.getContext();
                                                    String str8 = linkCell4.invite.link;
                                                    manageLinksActivity2.showDialog(new ShareAlert(context5, str8, str8, manageLinksActivity2.getResourceProvider()) {
                                                        public AnonymousClass1(Context context6, String str9, String str10, Theme.ResourcesProvider resourcesProvider) {
                                                            super(context6, str10, str10, resourcesProvider);
                                                        }

                                                        @Override
                                                        public final void onSend(LongSparseArray longSparseArray, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z3) {
                                                            String string4;
                                                            if (z3) {
                                                                LinkCell linkCell5 = LinkCell.this;
                                                                if (longSparseArray == null || longSparseArray.size() != 1) {
                                                                    string4 = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i7, new Object[0]));
                                                                } else {
                                                                    long j = ((TLRPC.Dialog) longSparseArray.valueAt(0)).id;
                                                                    string4 = (j == 0 || j == ManageLinksActivity.this.getUserConfig().getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, ManageLinksActivity.this.getMessagesController().getPeerName(j, true));
                                                                }
                                                                Bulletin bulletinCreateSimpleBulletinWithIconSize = BulletinFactory.of(ManageLinksActivity.this).createSimpleBulletinWithIconSize(R.raw.forward, 36, AndroidUtilities.replaceTags(string4));
                                                                bulletinCreateSimpleBulletinWithIconSize.hideAfterBottomSheet = false;
                                                                bulletinCreateSimpleBulletinWithIconSize.show(true);
                                                            }
                                                        }
                                                    });
                                                }
                                            } catch (Exception e2) {
                                                FileLog.e(e2);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            ManageLinksActivity.LinkCell linkCell5 = linkCell;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = linkCell5.invite;
                                            ManageLinksActivity manageLinksActivity3 = ManageLinksActivity.this;
                                            LinkEditActivity linkEditActivity = new LinkEditActivity(1, manageLinksActivity3.currentChatId);
                                            linkEditActivity.callback = manageLinksActivity3.linkEditActivityCallback;
                                            linkEditActivity.setInviteToEdit(tL_chatInviteExported2);
                                            manageLinksActivity3.presentFragment(linkEditActivity);
                                            break;
                                        default:
                                            final ManageLinksActivity.LinkCell linkCell6 = linkCell;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = linkCell6.invite;
                                            AlertDialog.Builder builder4 = new AlertDialog.Builder(ManageLinksActivity.this.getParentActivity(), 0, null);
                                            String string4 = LocaleController.getString(R.string.RevokeAlert);
                                            AlertDialog alertDialog4 = builder4.alertDialog;
                                            alertDialog4.message = string4;
                                            alertDialog4.title = LocaleController.getString(R.string.RevokeLink);
                                            final int i7 = 0;
                                            builder4.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new AlertDialog.OnButtonClickListener() {
                                                @Override
                                                public final void onClick(AlertDialog alertDialog5, int i8) {
                                                    switch (i7) {
                                                        case 0:
                                                            ManageLinksActivity.this.revokeLink(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ManageLinksActivity.this.deleteLink(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            ArticleViewer.IBlock.CC.m(R.string.Cancel, builder4, (AlertDialog.OnButtonClickListener) null);
                                            break;
                                    }
                                }
                            }, !z && z2);
                            int i6 = R.drawable.msg_delete;
                            String string3 = LocaleController.getString(R.string.RevokeLink);
                            Runnable runnable = new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i) {
                                        case 0:
                                            final ManageLinksActivity.LinkCell linkCell2 = linkCell;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = linkCell2.invite;
                                            AlertDialog.Builder builder3 = new AlertDialog.Builder(ManageLinksActivity.this.getParentActivity(), 0, null);
                                            String string4 = LocaleController.getString(R.string.DeleteLink);
                                            AlertDialog alertDialog3 = builder3.alertDialog;
                                            alertDialog3.title = string4;
                                            alertDialog3.message = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i7 = 1;
                                            builder3.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                                                @Override
                                                public final void onClick(AlertDialog alertDialog5, int i8) {
                                                    switch (i7) {
                                                        case 0:
                                                            ManageLinksActivity.this.revokeLink(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ManageLinksActivity.this.deleteLink(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            ArticleViewer.IBlock.CC.m(R.string.Cancel, builder3, (AlertDialog.OnButtonClickListener) null);
                                            break;
                                        case 1:
                                            ManageLinksActivity.LinkCell linkCell3 = linkCell;
                                            linkCell3.getClass();
                                            try {
                                                if (linkCell3.invite.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", linkCell3.invite.link));
                                                    BulletinFactory.of(ManageLinksActivity.this).createCopyLinkBulletin(false).show();
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            ManageLinksActivity.LinkCell linkCell4 = linkCell;
                                            ManageLinksActivity manageLinksActivity2 = ManageLinksActivity.this;
                                            try {
                                                if (linkCell4.invite.link != null) {
                                                    Context context6 = linkCell4.getContext();
                                                    String str10 = linkCell4.invite.link;
                                                    manageLinksActivity2.showDialog(new ShareAlert(context6, str10, str10, manageLinksActivity2.getResourceProvider()) {
                                                        public AnonymousClass1(Context context7, String str11, String str12, Theme.ResourcesProvider resourcesProvider) {
                                                            super(context7, str12, str12, resourcesProvider);
                                                        }

                                                        @Override
                                                        public final void onSend(LongSparseArray longSparseArray, int i8, TLRPC.TL_forumTopic tL_forumTopic, boolean z3) {
                                                            String string5;
                                                            if (z3) {
                                                                LinkCell linkCell5 = LinkCell.this;
                                                                if (longSparseArray == null || longSparseArray.size() != 1) {
                                                                    string5 = LocaleController.formatString(R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i8, new Object[0]));
                                                                } else {
                                                                    long j = ((TLRPC.Dialog) longSparseArray.valueAt(0)).id;
                                                                    string5 = (j == 0 || j == ManageLinksActivity.this.getUserConfig().getClientUserId()) ? LocaleController.getString(R.string.InvLinkToSavedMessages) : LocaleController.formatString(R.string.InvLinkToUser, ManageLinksActivity.this.getMessagesController().getPeerName(j, true));
                                                                }
                                                                Bulletin bulletinCreateSimpleBulletinWithIconSize = BulletinFactory.of(ManageLinksActivity.this).createSimpleBulletinWithIconSize(R.raw.forward, 36, AndroidUtilities.replaceTags(string5));
                                                                bulletinCreateSimpleBulletinWithIconSize.hideAfterBottomSheet = false;
                                                                bulletinCreateSimpleBulletinWithIconSize.show(true);
                                                            }
                                                        }
                                                    });
                                                }
                                            } catch (Exception e2) {
                                                FileLog.e(e2);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            ManageLinksActivity.LinkCell linkCell5 = linkCell;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = linkCell5.invite;
                                            ManageLinksActivity manageLinksActivity3 = ManageLinksActivity.this;
                                            LinkEditActivity linkEditActivity = new LinkEditActivity(1, manageLinksActivity3.currentChatId);
                                            linkEditActivity.callback = manageLinksActivity3.linkEditActivityCallback;
                                            linkEditActivity.setInviteToEdit(tL_chatInviteExported2);
                                            manageLinksActivity3.presentFragment(linkEditActivity);
                                            break;
                                        default:
                                            final ManageLinksActivity.LinkCell linkCell6 = linkCell;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = linkCell6.invite;
                                            AlertDialog.Builder builder4 = new AlertDialog.Builder(ManageLinksActivity.this.getParentActivity(), 0, null);
                                            String string5 = LocaleController.getString(R.string.RevokeAlert);
                                            AlertDialog alertDialog4 = builder4.alertDialog;
                                            alertDialog4.message = string5;
                                            alertDialog4.title = LocaleController.getString(R.string.RevokeLink);
                                            final int i8 = 0;
                                            builder4.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new AlertDialog.OnButtonClickListener() {
                                                @Override
                                                public final void onClick(AlertDialog alertDialog5, int i9) {
                                                    switch (i8) {
                                                        case 0:
                                                            ManageLinksActivity.this.revokeLink(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ManageLinksActivity.this.deleteLink(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            ArticleViewer.IBlock.CC.m(R.string.Cancel, builder4, (AlertDialog.OnButtonClickListener) null);
                                            break;
                                    }
                                }
                            };
                            if (z2) {
                                itemOptionsMakeOptions.add(i6, string3, runnable, true);
                            }
                        }
                        itemOptionsMakeOptions.setScrimViewBackground(manageLinksActivity.listView.getClipBackground(linkCell, false));
                        itemOptionsMakeOptions.show();
                        break;
                    }
                }
                break;
            case 10:
                MessageStatisticActivity messageStatisticActivity = (MessageStatisticActivity) this.f$0;
                if (!messageStatisticActivity.messageObject.isStory()) {
                    int size = ((ActionBarLayout) messageStatisticActivity.getParentLayout()).getFragmentStack().size();
                    long j = messageStatisticActivity.chatId;
                    if (size > 1) {
                        BaseFragment baseFragment = (BaseFragment) ArticleViewer.IBlock.CC.m((ActionBarLayout) messageStatisticActivity.getParentLayout(), 2, ((ActionBarLayout) messageStatisticActivity.getParentLayout()).getFragmentStack());
                        if ((baseFragment instanceof ChatActivity) && ((ChatActivity) baseFragment).currentChat.id == j) {
                            messageStatisticActivity.finishFragment();
                        }
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j);
                    bundle.putInt("message_id", messageStatisticActivity.messageId);
                    bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                    messageStatisticActivity.presentFragment(new ChatActivity(bundle));
                    break;
                }
                break;
            case 11:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f$0;
                int i7 = passcodeActivity.type;
                if (i7 != 1) {
                    if (i7 == 2) {
                        passcodeActivity.processDone$8();
                    }
                } else if (passcodeActivity.passcodeSetStep != 0) {
                    passcodeActivity.processDone$8();
                } else {
                    passcodeActivity.processNext();
                }
                break;
            case 12:
                PasscodeActivity.RLottieImageHolderView rLottieImageHolderView = (PasscodeActivity.RLottieImageHolderView) this.f$0;
                if (!rLottieImageHolderView.imageView.getAnimatedDrawable().isRunning) {
                    rLottieImageHolderView.imageView.getAnimatedDrawable().setCurrentFrame(0, false, false);
                    rLottieImageHolderView.imageView.playAnimation();
                }
                break;
            case 13:
                ((PasskeysActivity) this.f$0).openMenu(view);
                break;
            case 14:
                PassportActivity.PhoneConfirmationView phoneConfirmationView = (PassportActivity.PhoneConfirmationView) this.f$0;
                if (!phoneConfirmationView.nextPressed) {
                    int i8 = phoneConfirmationView.nextType;
                    if ((i8 == 4 && phoneConfirmationView.verificationType == 2) || i8 == 0) {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + phoneConfirmationView.phone);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + phoneConfirmationView.phone + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + phoneConfirmationView.lastError);
                            phoneConfirmationView.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                        } catch (Exception unused) {
                            AlertsCreator.showSimpleAlert(PassportActivity.this, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    } else {
                        phoneConfirmationView.resendCode$1();
                    }
                    break;
                }
                break;
            case 15:
                PeerColorActivity.this.buttonClick$1();
                break;
            case 16:
                PhotoAlbumPickerActivity photoAlbumPickerActivity = (PhotoAlbumPickerActivity) this.f$0;
                ChatActivity chatActivity = photoAlbumPickerActivity.chatActivity;
                if (chatActivity != null && chatActivity.isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(photoAlbumPickerActivity.getParentActivity(), chatActivity.getDialogId(), new PhotoAlbumPickerActivity$$ExternalSyntheticLambda2(photoAlbumPickerActivity, i3));
                } else {
                    photoAlbumPickerActivity.sendSelectedPhotos(photoAlbumPickerActivity.selectedPhotosOrder, photoAlbumPickerActivity.selectedPhotos);
                    photoAlbumPickerActivity.finishFragment();
                }
                break;
            case 17:
                PhotoPickerActivity photoPickerActivity = (PhotoPickerActivity) this.f$0;
                ChatActivity chatActivity2 = photoPickerActivity.chatActivity;
                if (chatActivity2 != null && chatActivity2.isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(photoPickerActivity.getParentActivity(), chatActivity2.getDialogId(), new PhotoPickerActivity$$ExternalSyntheticLambda1(photoPickerActivity, i4));
                } else {
                    photoPickerActivity.sendSelectedPhotos(0, true);
                }
                break;
            case 18:
                PhotoViewer.CaptionScrollView captionScrollView = (PhotoViewer.CaptionScrollView) this.f$0;
                if (captionScrollView != null) {
                    captionScrollView.smoothScrollBy(0, AndroidUtilities.dp(64.0f), false);
                }
                break;
            case 19:
                PhotoViewer.ListAdapter listAdapter = (PhotoViewer.ListAdapter) this.f$0;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = listAdapter.this$0;
                int iIndexOf = photoViewer.imagesArrLocals.indexOf(tag);
                if (iIndexOf < 0) {
                    int photoUnchecked = photoViewer.placeProvider.setPhotoUnchecked(tag);
                    if (photoUnchecked >= 0) {
                        photoViewer.selectedPhotosAdapter.mObservable.notifyItemRangeRemoved(photoUnchecked, 1);
                        if (photoUnchecked == 0) {
                            photoViewer.selectedPhotosAdapter.notifyItemChanged(0);
                        }
                        photoViewer.updateSelectedCount$1();
                    }
                } else {
                    int photoChecked = photoViewer.placeProvider.setPhotoChecked(iIndexOf, photoViewer.getCurrentVideoEditedInfo());
                    boolean zIsPhotoChecked = photoViewer.placeProvider.isPhotoChecked(iIndexOf);
                    if (iIndexOf == photoViewer.currentIndex) {
                        photoViewer.checkImageView.setChecked(zIsPhotoChecked, true);
                    }
                    if (photoChecked >= 0) {
                        photoViewer.selectedPhotosAdapter.mObservable.notifyItemRangeRemoved(photoChecked, 1);
                        if (photoChecked == 0) {
                            photoViewer.selectedPhotosAdapter.notifyItemChanged(0);
                        }
                    }
                    photoViewer.updateSelectedCount$1();
                }
                break;
            case 20:
                PollCreateActivity pollCreateActivity = (PollCreateActivity) this.f$0;
                pollCreateActivity.getClass();
                if (view.getTag() == null) {
                    view.setTag(1);
                    PollEditTextCell pollEditTextCell = (PollEditTextCell) view.getParent();
                    RecyclerView.ViewHolder viewHolderFindContainingViewHolder = pollCreateActivity.listView.findContainingViewHolder(pollEditTextCell);
                    if (viewHolderFindContainingViewHolder != null && (adapterPosition = viewHolderFindContainingViewHolder.getAdapterPosition()) != -1) {
                        int i9 = adapterPosition - pollCreateActivity.answerStartRow;
                        if (pollCreateActivity.onlyAdding && i9 < pollCreateActivity.oldAnswersCount) {
                            int i10 = -pollCreateActivity.shiftDp;
                            pollCreateActivity.shiftDp = i10;
                            AndroidUtilities.shakeViewSpring(pollEditTextCell, i10);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        } else {
                            pollCreateActivity.listAdapter.mObservable.notifyItemRangeRemoved(adapterPosition, 1);
                            int i11 = i9 + 1;
                            CharSequence[] charSequenceArr = pollCreateActivity.answers;
                            System.arraycopy(charSequenceArr, i11, charSequenceArr, i9, (charSequenceArr.length - 1) - i9);
                            boolean[] zArr = pollCreateActivity.answersChecks;
                            System.arraycopy(zArr, i11, zArr, i9, (zArr.length - 1) - i9);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i12 = pollCreateActivity.answersCount - 1;
                            pollCreateActivity.answersCount = i12;
                            if (pollCreateActivity.answerIds != null) {
                                int[] iArr = new int[i12];
                                while (i3 < i12) {
                                    iArr[i3] = pollCreateActivity.answerIds[i3 >= i9 ? i3 + 1 : i3];
                                    i3++;
                                }
                                pollCreateActivity.answerIds = iArr;
                            }
                            if (pollCreateActivity.answersCount == charSequenceArr.length - 1) {
                                pollCreateActivity.listAdapter.mObservable.notifyItemRangeInserted((pollCreateActivity.answerStartRow + charSequenceArr.length) - 1, 1);
                            }
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = pollCreateActivity.listView.findViewHolderForAdapterPosition(adapterPosition - 1);
                            EditTextBoldCursor textView = pollEditTextCell.getTextView();
                            if (viewHolderFindViewHolderForAdapterPosition != null) {
                                View view3 = viewHolderFindViewHolderForAdapterPosition.itemView;
                                if (view3 instanceof PollEditTextCell) {
                                    ((PollEditTextCell) view3).getTextView().requestFocus();
                                } else if (textView.isFocused()) {
                                    AndroidUtilities.hideKeyboard(textView);
                                    pollCreateActivity.hideEmojiPopup$2(true);
                                } else if (pollCreateActivity.isEmojiSearchOpened) {
                                    pollCreateActivity.hideEmojiPopup$2(true);
                                }
                            } else if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                pollCreateActivity.hideEmojiPopup$2(true);
                            } else if (pollCreateActivity.isEmojiSearchOpened) {
                                pollCreateActivity.hideEmojiPopup$2(true);
                            }
                            textView.clearFocus();
                            pollCreateActivity.checkDoneButton$2();
                            pollCreateActivity.updateRows$12$1();
                            SuggestEmojiView suggestEmojiView = pollCreateActivity.suggestEmojiPanel;
                            if (suggestEmojiView != null) {
                                suggestEmojiView.forceClose();
                                pollCreateActivity.suggestEmojiPanel.setDelegate(null);
                            }
                            pollCreateActivity.listAdapter.notifyItemChanged(pollCreateActivity.answerSectionRow);
                        }
                        break;
                    }
                }
                break;
            case 21:
                ((PollItemMenu) this.f$0).dismiss(true);
                break;
            case 22:
                ((PollItemMenu) ((PollItemMenu.AnonymousClass4) this.f$0).this$0).dismiss(true);
                break;
            case 23:
                PrivacyControlActivity.ListAdapter listAdapter2 = (PrivacyControlActivity.ListAdapter) this.f$0;
                listAdapter2.getClass();
                PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                privacyControlActivity.showDialog(new PremiumFeatureBottomSheet((BaseFragment) privacyControlActivity, 27, false));
                break;
            case 24:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.f$0;
                privacySettingsActivity.getClass();
                CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                int iIntValue = ((Integer) checkBoxCell.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.clear;
                boolean z3 = !zArr2[iIntValue];
                zArr2[iIntValue] = z3;
                checkBoxCell.setChecked(z3, true);
                break;
            case 25:
                ProxyListActivity.TextDetailProxyCell textDetailProxyCell = (ProxyListActivity.TextDetailProxyCell) this.f$0;
                ProxyListActivity.this.presentFragment(new ProxySettingsActivity(textDetailProxyCell.currentInfo));
                break;
            case 26:
                QrActivity.ThemeListViewController themeListViewController = (QrActivity.ThemeListViewController) this.f$0;
                ValueAnimator valueAnimator = themeListViewController.changeDayNightViewAnimator;
                if (valueAnimator == null) {
                    boolean z4 = !themeListViewController.forceDark;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    QrActivity qrActivity = themeListViewController.fragment;
                    FrameLayout frameLayout = (FrameLayout) qrActivity.getParentActivity().getWindow().getDecorView();
                    FrameLayout frameLayout2 = (FrameLayout) themeListViewController.window.getDecorView();
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    QrActivity.ThemeListViewController.AnonymousClass3 anonymousClass4 = themeListViewController.darkThemeView;
                    anonymousClass4.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    frameLayout2.draw(canvas);
                    anonymousClass4.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr2 = new int[2];
                    anonymousClass4.getLocationInWindow(iArr2);
                    float f = iArr2[0];
                    float f2 = iArr2[1];
                    float measuredWidth = (anonymousClass4.getMeasuredWidth() / 2.0f) + f;
                    float measuredHeight = (anonymousClass4.getMeasuredHeight() / 2.0f) + f2;
                    float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) * 0.9f;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                    themeListViewController.changeDayNightView = new StoryRecorder.AnonymousClass31(themeListViewController, qrActivity.getParentActivity(), z4, canvas, measuredWidth, measuredHeight, fMax, paint, bitmapCreateBitmap, paint2, f, f2, 2);
                    themeListViewController.changeDayNightViewProgress = 0.0f;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    themeListViewController.changeDayNightViewAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(themeListViewController, i2));
                    themeListViewController.changeDayNightViewAnimator.addListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(themeListViewController, 9));
                    themeListViewController.changeDayNightViewAnimator.setDuration(400L);
                    themeListViewController.changeDayNightViewAnimator.setInterpolator(Easings.easeInOutQuad);
                    themeListViewController.changeDayNightViewAnimator.start();
                    frameLayout2.addView(themeListViewController.changeDayNightView, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda5(6, themeListViewController, z4));
                    break;
                }
                break;
            case 27:
                ReportBottomSheet.Page page = (ReportBottomSheet.Page) this.f$0;
                ButtonWithCounterView buttonWithCounterView = page.button;
                if (buttonWithCounterView.enabled && !buttonWithCounterView.loading) {
                    buttonWithCounterView.setLoading(true);
                    CharSequence text = page.headerView.textView.getText();
                    byte[] bArr = page.commentOption.option;
                    String string4 = page.editTextCell.getText().toString();
                    int i13 = ReportBottomSheet.$r8$clinit;
                    ReportBottomSheet.this.submitOption(text, bArr, string4);
                    break;
                }
                break;
            case 28:
                ReportBottomSheet$Page$$ExternalSyntheticLambda0 reportBottomSheet$Page$$ExternalSyntheticLambda0 = ((ReportBottomSheet.Page.BigHeaderCell) this.f$0).onBackClickListener;
                if (reportBottomSheet$Page$$ExternalSyntheticLambda0 != null) {
                    reportBottomSheet$Page$$ExternalSyntheticLambda0.run();
                }
                break;
            default:
                ((RevenueSharingAdsInfoBottomSheet) this.f$0).lambda$new$3$17(view);
                break;
        }
    }
}
