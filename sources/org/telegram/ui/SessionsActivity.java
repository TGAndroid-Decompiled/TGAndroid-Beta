package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Business.BusinessChatbotController;
import org.telegram.ui.Business.ChatbotSheet;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.RadioColorCell;
import org.telegram.ui.Cells.SessionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.voip.CellFlickerDrawable;

public final class SessionsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public int botSessionsEndRow;
    public int botSessionsStartRow;
    public ArrayList bots;
    public TLRPC.TL_authorization currentSession;
    public int currentSessionRow;
    public int currentSessionSectionRow;
    public final int currentType;
    public PrivacySettingsActivity$$ExternalSyntheticLambda3 delegate;
    public EmptyTextProgressView emptyView;
    public boolean fragmentOpened;
    public FlickerLoadingView globalFlickerLoadingView;
    public boolean highlightLinkDesktopDevice;
    public ListAdapter listAdapter;
    public ChatActivity.AnonymousClass34 listView;
    public boolean loading;
    public int noOtherSessionsRow;
    public int otherSessionsEndRow;
    public int otherSessionsSectionRow;
    public int otherSessionsStartRow;
    public int otherSessionsTerminateDetail;
    public final ArrayList passwordSessions;
    public int passwordSessionsDetailRow;
    public int passwordSessionsEndRow;
    public int passwordSessionsSectionRow;
    public int passwordSessionsStartRow;
    public int qrCodeDividerRow;
    public int qrCodeRow;
    public int repeatLoad;
    public int rowCount;
    public final ArrayList sessions;
    public int terminateAllSessionsDetailRow;
    public int terminateAllSessionsRow;
    public int ttlDays;
    public int ttlDivideRow;
    public int ttlHeaderRow;
    public int ttlRow;
    public AnonymousClass4 undoView;

    public final class AnonymousClass4 extends UndoView {
        public AnonymousClass4(Context context) {
            super(context, null, false, null);
        }

        @Override
        public final void hide(int i, boolean z) {
            if (!z && getCurrentInfoObject() != null) {
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) getCurrentInfoObject();
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(((BaseFragment) SessionsActivity.this).currentAccount).sendRequest(resetauthorization, new ProfileActivity$$ExternalSyntheticLambda65(14, this, tL_authorization));
            }
            super.hide(i, z);
        }
    }

    public final class AnonymousClass5 implements SessionBottomSheet.Callback {
        public AnonymousClass5() {
        }
    }

    public final class AnonymousClass6 implements CameraScanActivity.CameraScanActivityDelegate {
        public TLObject response = null;
        public TLRPC.TL_error error = null;

        public AnonymousClass6() {
        }

        @Override
        public final void didFindMrzInfo(MrzRecognizer.Result result) {
        }

        @Override
        public final void didFindQr(String str) {
            TLObject tLObject = this.response;
            if (!(tLObject instanceof TLRPC.TL_authorization)) {
                if (this.error != null) {
                    AndroidUtilities.runOnUIThread(new SessionsActivity$6$$ExternalSyntheticLambda0(this, 0));
                    return;
                }
                return;
            }
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            boolean z = tL_authorization.password_pending;
            SessionsActivity sessionsActivity = SessionsActivity.this;
            if (z) {
                sessionsActivity.passwordSessions.add(0, tL_authorization);
                sessionsActivity.repeatLoad = 4;
                sessionsActivity.loadSessions(false);
            } else {
                sessionsActivity.sessions.add(0, tL_authorization);
            }
            sessionsActivity.updateRows$17();
            sessionsActivity.listAdapter.mObservable.notifyChanged();
            sessionsActivity.undoView.showWithAction(0L, 11, this.response, (Object) null, (Runnable) null, (Runnable) null);
        }

        @Override
        public final String getSubtitleText() {
            return null;
        }

        @Override
        public final void onDismiss() {
        }

        @Override
        public final boolean processQr(String str, CameraScanActivity$$ExternalSyntheticLambda0 cameraScanActivity$$ExternalSyntheticLambda0) {
            this.response = null;
            this.error = null;
            AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda8(this, str, cameraScanActivity$$ExternalSyntheticLambda0, 16), 750L);
            return true;
        }
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
            setHasStableIds(true);
        }

        @Override
        public final int getItemCount() {
            return SessionsActivity.this.rowCount;
        }

        @Override
        public final long getItemId(int i) {
            int iHash;
            SessionsActivity sessionsActivity = SessionsActivity.this;
            if (i == sessionsActivity.terminateAllSessionsRow) {
                iHash = Objects.hash(0, 0);
            } else if (i == sessionsActivity.terminateAllSessionsDetailRow) {
                iHash = Objects.hash(0, 1);
            } else if (i == sessionsActivity.otherSessionsTerminateDetail) {
                iHash = Objects.hash(0, 2);
            } else if (i == sessionsActivity.passwordSessionsDetailRow) {
                iHash = Objects.hash(0, 3);
            } else if (i == sessionsActivity.qrCodeDividerRow) {
                iHash = Objects.hash(0, 4);
            } else if (i == sessionsActivity.ttlDivideRow) {
                iHash = Objects.hash(0, 5);
            } else if (i == sessionsActivity.noOtherSessionsRow) {
                iHash = Objects.hash(0, 6);
            } else if (i == sessionsActivity.currentSessionSectionRow) {
                iHash = Objects.hash(0, 7);
            } else if (i == sessionsActivity.otherSessionsSectionRow) {
                iHash = Objects.hash(0, 8);
            } else if (i == sessionsActivity.passwordSessionsSectionRow) {
                iHash = Objects.hash(0, 9);
            } else if (i == sessionsActivity.ttlHeaderRow) {
                iHash = Objects.hash(0, 10);
            } else if (i == sessionsActivity.currentSessionRow) {
                iHash = Objects.hash(0, 11);
            } else {
                int i2 = sessionsActivity.otherSessionsStartRow;
                if (i < i2 || i >= sessionsActivity.otherSessionsEndRow) {
                    int i3 = sessionsActivity.botSessionsStartRow;
                    if (i < i3 || i >= sessionsActivity.botSessionsEndRow) {
                        int i4 = sessionsActivity.passwordSessionsStartRow;
                        if (i >= i4 && i < sessionsActivity.passwordSessionsEndRow) {
                            TLObject tLObject = (TLObject) sessionsActivity.passwordSessions.get(i - i4);
                            if (tLObject instanceof TLRPC.TL_authorization) {
                                iHash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                            } else if (tLObject instanceof TLRPC.TL_webAuthorization) {
                                iHash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                            } else {
                                iHash = Objects.hash(0, -1);
                            }
                        } else if (i == sessionsActivity.qrCodeRow) {
                            iHash = Objects.hash(0, 12);
                        } else if (i == sessionsActivity.ttlRow) {
                            iHash = Objects.hash(0, 13);
                        } else {
                            iHash = Objects.hash(0, -1);
                        }
                    } else {
                        iHash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) sessionsActivity.bots.get(i - i3)).bot_id));
                    }
                } else {
                    TLObject tLObject2 = (TLObject) sessionsActivity.sessions.get(i - i2);
                    if (tLObject2 instanceof TLRPC.TL_authorization) {
                        iHash = Objects.hash(1, Long.valueOf(((TLRPC.TL_authorization) tLObject2).hash));
                    } else if (tLObject2 instanceof TLRPC.TL_webAuthorization) {
                        iHash = Objects.hash(1, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject2).hash));
                    } else {
                        iHash = Objects.hash(0, -1);
                    }
                }
            }
            return iHash;
        }

        @Override
        public final int getItemViewType(int i) {
            SessionsActivity sessionsActivity = SessionsActivity.this;
            if (i == sessionsActivity.terminateAllSessionsRow) {
                return 0;
            }
            if (i == sessionsActivity.terminateAllSessionsDetailRow || i == sessionsActivity.otherSessionsTerminateDetail || i == sessionsActivity.passwordSessionsDetailRow || i == sessionsActivity.qrCodeDividerRow || i == sessionsActivity.ttlDivideRow || i == sessionsActivity.noOtherSessionsRow) {
                return 1;
            }
            if (i == sessionsActivity.currentSessionSectionRow || i == sessionsActivity.otherSessionsSectionRow || i == sessionsActivity.passwordSessionsSectionRow || i == sessionsActivity.ttlHeaderRow) {
                return 2;
            }
            if (i == sessionsActivity.currentSessionRow) {
                return 4;
            }
            if (i >= sessionsActivity.otherSessionsStartRow && i < sessionsActivity.otherSessionsEndRow) {
                return 4;
            }
            if (i >= sessionsActivity.botSessionsStartRow && i < sessionsActivity.botSessionsEndRow) {
                return 4;
            }
            if (i >= sessionsActivity.passwordSessionsStartRow && i < sessionsActivity.passwordSessionsEndRow) {
                return 4;
            }
            if (i == sessionsActivity.qrCodeRow) {
                return 5;
            }
            return i == sessionsActivity.ttlRow ? 6 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            SessionsActivity sessionsActivity = SessionsActivity.this;
            if (adapterPosition == sessionsActivity.terminateAllSessionsRow) {
                return true;
            }
            if (adapterPosition >= sessionsActivity.otherSessionsStartRow && adapterPosition < sessionsActivity.otherSessionsEndRow) {
                return true;
            }
            if (adapterPosition < sessionsActivity.botSessionsStartRow || adapterPosition >= sessionsActivity.botSessionsEndRow) {
                return (adapterPosition >= sessionsActivity.passwordSessionsStartRow && adapterPosition < sessionsActivity.passwordSessionsEndRow) || adapterPosition == sessionsActivity.currentSessionRow || adapterPosition == sessionsActivity.ttlRow;
            }
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String pluralString;
            int i2 = viewHolder.mItemViewType;
            boolean z = false;
            if (i2 == 0) {
                TextCell textCell = (TextCell) viewHolder.itemView;
                SessionsActivity sessionsActivity = SessionsActivity.this;
                if (i != sessionsActivity.terminateAllSessionsRow) {
                    if (i == sessionsActivity.qrCodeRow) {
                        int i3 = Theme.key_windowBackgroundWhiteBlueText4;
                        textCell.setColors(i3, i3);
                        textCell.setTag(Integer.valueOf(i3));
                        textCell.setTextAndIcon(R.drawable.msg_qrcode, LocaleController.getString(R.string.AuthAnotherClient), !SessionsActivity.this.sessions.isEmpty());
                        return;
                    }
                    return;
                }
                int i4 = Theme.key_text_RedRegular;
                textCell.setColors(i4, i4);
                textCell.setTag(Integer.valueOf(i4));
                if (SessionsActivity.this.currentType == 0) {
                    textCell.setTextAndIcon(R.drawable.msg_block2, (CharSequence) LocaleController.getString(R.string.TerminateAllSessions), false);
                    return;
                } else {
                    textCell.setTextAndIcon(R.drawable.msg_block2, (CharSequence) LocaleController.getString(R.string.TerminateAllWebSessions), false);
                    return;
                }
            }
            if (i2 == 1) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                textInfoPrivacyCell.setFixedSize(0);
                SessionsActivity sessionsActivity2 = SessionsActivity.this;
                if (i == sessionsActivity2.terminateAllSessionsDetailRow) {
                    if (sessionsActivity2.currentType == 0) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ClearOtherSessionsHelp));
                        return;
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ClearOtherWebSessionsHelp));
                        return;
                    }
                }
                if (i == sessionsActivity2.otherSessionsTerminateDetail) {
                    if (sessionsActivity2.currentType != 0) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.TerminateWebSessionInfo));
                        return;
                    } else if (sessionsActivity2.sessions.isEmpty()) {
                        textInfoPrivacyCell.setText("");
                        return;
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.SessionsListInfo));
                        return;
                    }
                }
                if (i == sessionsActivity2.passwordSessionsDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.LoginAttemptsInfo));
                    return;
                } else {
                    if (i == sessionsActivity2.qrCodeDividerRow || i == sessionsActivity2.ttlDivideRow || i == sessionsActivity2.noOtherSessionsRow) {
                        textInfoPrivacyCell.setText("");
                        textInfoPrivacyCell.setFixedSize(12);
                        return;
                    }
                    return;
                }
            }
            if (i2 == 2) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                SessionsActivity sessionsActivity3 = SessionsActivity.this;
                if (i == sessionsActivity3.currentSessionSectionRow) {
                    headerCell.setText(LocaleController.getString(R.string.CurrentSession));
                    return;
                }
                if (i == sessionsActivity3.otherSessionsSectionRow) {
                    if (sessionsActivity3.currentType == 0) {
                        headerCell.setText(LocaleController.getString(R.string.OtherSessions));
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString(R.string.OtherWebSessions));
                        return;
                    }
                }
                if (i == sessionsActivity3.passwordSessionsSectionRow) {
                    headerCell.setText(LocaleController.getString(R.string.LoginAttempts));
                    return;
                } else {
                    if (i == sessionsActivity3.ttlHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.TerminateOldSessionHeader));
                        return;
                    }
                    return;
                }
            }
            if (i2 != 5) {
                if (i2 == 6) {
                    TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                    int i5 = SessionsActivity.this.ttlDays;
                    if (i5 <= 30 || i5 > 183) {
                        pluralString = i5 == 365 ? LocaleController.formatPluralString("Years", i5 / 365, new Object[0]) : LocaleController.formatPluralString("Weeks", i5 / 7, new Object[0]);
                    } else {
                        pluralString = LocaleController.formatPluralString("Months", i5 / 30, new Object[0]);
                    }
                    textSettingsCell.setTextAndValue(LocaleController.getString(R.string.IfInactiveFor), pluralString, true, false);
                    return;
                }
                SessionCell sessionCell = (SessionCell) viewHolder.itemView;
                SessionsActivity sessionsActivity4 = SessionsActivity.this;
                if (i == sessionsActivity4.currentSessionRow) {
                    TLRPC.TL_authorization tL_authorization = sessionsActivity4.currentSession;
                    if (tL_authorization != null) {
                        sessionCell.setSession(tL_authorization, (sessionsActivity4.sessions.isEmpty() && SessionsActivity.this.passwordSessions.isEmpty() && SessionsActivity.this.qrCodeRow == -1) ? false : true);
                        return;
                    }
                    sessionCell.globalGradient = sessionsActivity4.globalFlickerLoadingView;
                    sessionCell.showStub = true;
                    Drawable drawableMutate = ApplicationLoader.applicationContext.getDrawable(AndroidUtilities.isTablet() ? R.drawable.device_tablet_android : R.drawable.device_phone_android).mutate();
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_avatar_text, false), PorterDuff.Mode.SRC_IN));
                    CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createCircleDrawable(AndroidUtilities.dp(42.0f), Theme.getColor(null, Theme.key_avatar_backgroundGreen, false)), drawableMutate);
                    BackupImageView backupImageView = sessionCell.placeholderImageView;
                    if (backupImageView != null) {
                        backupImageView.setImageDrawable(combinedDrawable);
                    } else {
                        sessionCell.imageView.setImageDrawable(combinedDrawable);
                    }
                    sessionCell.invalidate();
                    return;
                }
                int i6 = sessionsActivity4.otherSessionsStartRow;
                if (i >= i6 && i < sessionsActivity4.otherSessionsEndRow) {
                    sessionCell.setSession((TLObject) sessionsActivity4.sessions.get(i - i6), i != SessionsActivity.this.otherSessionsEndRow - 1);
                    return;
                }
                int i7 = sessionsActivity4.botSessionsStartRow;
                if (i < i7 || i >= sessionsActivity4.botSessionsEndRow) {
                    int i8 = sessionsActivity4.passwordSessionsStartRow;
                    if (i < i8 || i >= sessionsActivity4.passwordSessionsEndRow) {
                        return;
                    }
                    sessionCell.setSession((TLObject) sessionsActivity4.passwordSessions.get(i - i8), i != SessionsActivity.this.passwordSessionsEndRow - 1);
                    return;
                }
                int i9 = i - i7;
                ArrayList arrayList = sessionsActivity4.bots;
                if (arrayList == null || i9 < 0 || i9 >= arrayList.size()) {
                    return;
                }
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) SessionsActivity.this.bots.get(i9);
                SessionsActivity sessionsActivity5 = SessionsActivity.this;
                if (i != sessionsActivity5.botSessionsEndRow - 1 && i != sessionsActivity5.otherSessionsEndRow - 1) {
                    z = true;
                }
                sessionCell.setSession(tL_connectedBot, z);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textCell;
            Context context = this.mContext;
            if (i == 0) {
                textCell = new TextCell(context);
            } else if (i == 1) {
                textCell = new TextInfoPrivacyCell(context, 24, null);
            } else if (i != 2) {
                SessionsActivity sessionsActivity = SessionsActivity.this;
                if (i != 5) {
                    textCell = i != 6 ? new SessionCell(context, sessionsActivity.currentType) : new TextSettingsCell(context, 0, null);
                } else {
                    textCell = sessionsActivity.new ScanQRCodeView(context);
                }
            } else {
                textCell = new HeaderCell(context);
            }
            return new RecyclerListView.Holder(textCell);
        }
    }

    public final class ScanQRCodeView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
        public final VoIPFragment.AnonymousClass5 buttonTextView;
        public final CellFlickerDrawable flickerDrawable;
        public final BackupImageView imageView;

        public ScanQRCodeView(Context context) {
            super(context);
            CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable(64, 204, 160);
            this.flickerDrawable = cellFlickerDrawable;
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            addView(backupImageView, LayoutHelper.createFrame(120, 120.0f, 1, 0.0f, 16.0f, 0.0f, 0.0f));
            cellFlickerDrawable.repeatEnabled = false;
            cellFlickerDrawable.animationSpeedScale = 1.2f;
            backupImageView.setOnClickListener(new ChatActivity.AnonymousClass109(this, 8));
            int i = Theme.key_windowBackgroundWhiteBlackText;
            Theme.getColor(null, i, false);
            int i2 = Theme.key_windowBackgroundWhite;
            Theme.getColor(null, i2, false);
            int i3 = Theme.key_featuredStickers_addButton;
            Theme.getColor(null, i3, false);
            Theme.getColor(null, i2, false);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
            addView(linksTextView, LayoutHelper.createFrame(-1, -2.0f, 0, 36.0f, 152.0f, 36.0f, 0.0f));
            linksTextView.setGravity(1);
            linksTextView.setTextColor(Theme.getColor(null, i, false));
            linksTextView.setTextSize(1, 15.0f);
            linksTextView.setLinkTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
            linksTextView.setHighlightColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkSelection, false));
            String string = LocaleController.getString(R.string.AuthAnotherClientInfo4);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int iIndexOf = string.indexOf(42);
            int i4 = iIndexOf + 1;
            int iIndexOf2 = string.indexOf(42, i4);
            if (iIndexOf != -1 && iIndexOf2 != -1 && iIndexOf != iIndexOf2) {
                linksTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                spannableStringBuilder.replace(iIndexOf2, iIndexOf2 + 1, (CharSequence) "");
                spannableStringBuilder.replace(iIndexOf, i4, (CharSequence) "");
                spannableStringBuilder.setSpan(new URLSpanNoUnderline(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), null), iIndexOf, iIndexOf2 - 1, 33);
            }
            String string2 = spannableStringBuilder.toString();
            int iIndexOf3 = string2.indexOf(42);
            int i5 = iIndexOf3 + 1;
            int iIndexOf4 = string2.indexOf(42, i5);
            if (iIndexOf3 != -1 && iIndexOf4 != -1 && iIndexOf3 != iIndexOf4) {
                linksTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                spannableStringBuilder.replace(iIndexOf4, iIndexOf4 + 1, (CharSequence) "");
                spannableStringBuilder.replace(iIndexOf3, i5, (CharSequence) "");
                spannableStringBuilder.setSpan(new URLSpanNoUnderline(LocaleController.getString(R.string.AuthAnotherWebClientUrl), null), iIndexOf3, iIndexOf4 - 1, 33);
            }
            linksTextView.setText(spannableStringBuilder);
            VoIPFragment.AnonymousClass5 anonymousClass5 = new VoIPFragment.AnonymousClass5(this, context, 3);
            this.buttonTextView = anonymousClass5;
            anonymousClass5.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            anonymousClass5.setGravity(17);
            anonymousClass5.setTextSize(1, 14.0f);
            anonymousClass5.setTypeface(AndroidUtilities.bold());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) ".  ").append((CharSequence) LocaleController.getString(R.string.LinkDesktopDevice));
            spannableStringBuilder2.setSpan(new ColoredImageSpan(0, getContext().getDrawable(R.drawable.msg_mini_qr)), 0, 1, 0);
            anonymousClass5.setText(spannableStringBuilder2);
            anonymousClass5.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
            int iDp = AndroidUtilities.dp(24.0f);
            int color = Theme.getColor(null, i3, false);
            int color2 = Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
            anonymousClass5.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, color2, color2));
            anonymousClass5.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(this, 5));
            addView(anonymousClass5, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
            setSticker$4();
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0])) {
                setSticker$4();
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            setSticker$4();
            NotificationCenter.getInstance(((BaseFragment) SessionsActivity.this).currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(((BaseFragment) SessionsActivity.this).currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(276.0f), 1073741824));
        }

        public final void setSticker$4() {
            SessionsActivity sessionsActivity = SessionsActivity.this;
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(((BaseFragment) sessionsActivity).currentAccount).getStickerSetByName("tg_placeholders_android");
            if (stickerSetByName == null) {
                stickerSetByName = MediaDataController.getInstance(((BaseFragment) sessionsActivity).currentAccount).getStickerSetByEmojiOrName("tg_placeholders_android");
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
            TLRPC.Document document = (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() <= 6) ? null : tL_messages_stickerSet.documents.get(6);
            SvgHelper.SvgDrawable svgThumb = document != null ? DocumentObject.getSvgThumb(document.thumbs, Theme.key_emptyListPlaceholder, 0.2f) : null;
            if (svgThumb != null) {
                svgThumb.overrideWidthAndHeight(512, 512);
            }
            if (document == null) {
                MediaDataController.getInstance(((BaseFragment) sessionsActivity).currentAccount).loadStickersByEmojiOrName("tg_placeholders_android", false, tL_messages_stickerSet == null);
                return;
            }
            ImageLocation forDocument = ImageLocation.getForDocument(document);
            BackupImageView backupImageView = this.imageView;
            backupImageView.setImage(forDocument, "130_130", null, null, svgThumb, "tgs", 0, tL_messages_stickerSet);
            backupImageView.getImageReceiver().setAutoRepeat(2);
        }
    }

    public SessionsActivity(int i) {
        super(null);
        this.sessions = new ArrayList();
        this.passwordSessions = new ArrayList();
        this.bots = new ArrayList();
        this.repeatLoad = 0;
        this.currentType = i;
    }

    @Override
    public final View createView(Context context) {
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
        this.globalFlickerLoadingView = flickerLoadingView;
        int i = 1;
        flickerLoadingView.setIsSingleCell(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i2 = this.currentType;
        if (i2 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Devices));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WebSessionsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 23));
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isRightLayout) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, null);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.showProgress();
        frameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1, -1, 17));
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, context, 26);
        this.listView = anonymousClass34;
        anonymousClass34.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setLayoutManager(new PhotoViewer.AnonymousClass36(i, 17, false));
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setEmptyView(this.emptyView);
        ChatActivity.AnonymousClass34 anonymousClass35 = this.listView;
        anonymousClass35.animateEmptyView = true;
        anonymousClass35.emptyViewAnimationType = 0;
        frameLayout.addView(anonymousClass35, LayoutHelper.createFrame(-1.0f, -1));
        this.listView.setAdapter(this.listAdapter);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(150L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.translationInterpolator = cubicBezierInterpolator;
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 7));
        if (i2 == 0) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(context);
            this.undoView = anonymousClass4;
            frameLayout.addView(anonymousClass4, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        updateRows$17();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.newSessionReceived) {
            loadSessions(true);
        }
    }

    public final int getSessionsCount() {
        ArrayList arrayList = this.sessions;
        if (arrayList.size() == 0 && this.loading) {
            return 0;
        }
        return arrayList.size() + (this.currentType == 0 ? 1 : 0);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{TextSettingsCell.class, HeaderCell.class, SessionCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.emptyView, 2048, null, null, null, null, Theme.key_progressCircle));
        int i = Theme.key_text_RedRegular;
        arrayList.add(new ThemeDescription(this.listView, 262148, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 262148, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueText4));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SessionCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{SessionCell.class}, new String[]{"onlineTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        int i3 = Theme.key_windowBackgroundWhiteGrayText3;
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{SessionCell.class}, new String[]{"onlineTextView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SessionCell.class}, new String[]{"detailTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SessionCell.class}, new String[]{"detailExTextView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.undoView, 32, null, null, null, null, Theme.key_undo_background));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i));
        int i4 = Theme.key_undo_infoColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.undoView, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i4));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$12$7() {
        if (this.currentType == 0) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new SessionsActivity$$ExternalSyntheticLambda13(this, 2));
        } else {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new SessionsActivity$$ExternalSyntheticLambda13(this, 3));
        }
    }

    public final void lambda$createView$19(int i, boolean[] zArr) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3, null);
        alertDialog.canCacnel = false;
        alertDialog.show();
        ArrayList arrayList = this.sessions;
        if (this.currentType == 0) {
            int i2 = this.otherSessionsStartRow;
            TLRPC.TL_authorization tL_authorization = (i < i2 || i >= this.otherSessionsEndRow) ? (TLRPC.TL_authorization) this.passwordSessions.get(i - this.passwordSessionsStartRow) : (TLRPC.TL_authorization) arrayList.get(i - i2);
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(resetauthorization, new LinkManager$$ExternalSyntheticLambda0(this, alertDialog, tL_authorization, 27));
            return;
        }
        TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList.get(i - this.otherSessionsStartRow);
        TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
        resetwebauthorization.hash = tL_webAuthorization.hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(resetwebauthorization, new LinkManager$$ExternalSyntheticLambda0(this, alertDialog, tL_webAuthorization, 28));
        if (zArr[0]) {
            MessagesController.getInstance(this.currentAccount).blockPeer(tL_webAuthorization.bot_id);
        }
    }

    public final void lambda$createView$20(int i) {
        CharSequence string;
        TLRPC.TL_authorization tL_authorization;
        ArrayList arrayList;
        String string2;
        int i2;
        boolean z = true;
        char c = 1;
        char c2 = 1;
        if (i == this.ttlRow) {
            if (getParentActivity() == null) {
                return;
            }
            int i3 = this.ttlDays;
            if (i3 <= 7) {
                i2 = 0;
            } else if (i3 <= 93) {
                i2 = 1;
            } else {
                i2 = i3 <= 183 ? 2 : 3;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string3 = LocaleController.getString(R.string.SessionsSelfDestruct);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string3;
            String[] strArr = {LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Years", 1, new Object[0])};
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            builder.setView(linearLayout);
            int i4 = 0;
            while (i4 < 4) {
                RadioColorCell radioColorCell = new RadioColorCell(getParentActivity(), null);
                radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                radioColorCell.setTag(Integer.valueOf(i4));
                radioColorCell.setCheckColor(Theme.getColor(null, Theme.key_radioBackground, false), Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false));
                radioColorCell.setTextAndValue(strArr[i4], i2 == i4);
                linearLayout.addView(radioColorCell);
                radioColorCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
                radioColorCell.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(10, this, builder));
                i4++;
            }
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog);
            return;
        }
        int i5 = this.terminateAllSessionsRow;
        int i6 = this.currentType;
        if (i == i5) {
            if (getParentActivity() == null) {
                return;
            }
            ArrayList arrayList2 = this.bots;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
                AlertDialog alertDialog2 = builder2.alertDialog;
                if (i6 == 0) {
                    alertDialog2.message = LocaleController.getString(R.string.AreYouSureSessions);
                    alertDialog2.title = LocaleController.getString(R.string.AreYouSureSessionsTitle);
                    string2 = LocaleController.getString(R.string.Terminate);
                } else {
                    alertDialog2.message = LocaleController.getString(R.string.AreYouSureWebSessions);
                    alertDialog2.title = LocaleController.getString(R.string.TerminateWebSessionsTitle);
                    string2 = LocaleController.getString(R.string.Disconnect);
                }
                builder2.setPositiveButton(string2, new SessionsActivity$$ExternalSyntheticLambda4(this, c == true ? 1 : 0));
                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog2);
                TextView textView = (TextView) alertDialog2.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                    return;
                }
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ArrayList arrayList3 = this.bots;
            int size = arrayList3.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList3.get(i7);
                i7++;
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TL_account.TL_connectedBot) obj).bot_id));
                if (user != null) {
                    String publicUsername = UserObject.getPublicUsername(user);
                    if (TextUtils.isEmpty(publicUsername)) {
                        spannableStringBuilder.append(UserObject.getUserName(user));
                    } else {
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append(", ");
                        }
                        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder("@").append((CharSequence) publicUsername);
                        spannableStringBuilderAppend.setSpan(new URLSpanNoUnderline(zzil.m("https://t.me/", publicUsername), null), 0, spannableStringBuilderAppend.length(), 33);
                        spannableStringBuilder.append((CharSequence) spannableStringBuilderAppend);
                    }
                }
            }
            AlertsCreator.showAlertWithCheckbox(getParentActivity(), LocaleController.getString(R.string.AreYouSureSessionsTitle), LocaleController.getString(R.string.AreYouSureSessions), LocaleController.formatSpannable(R.string.AlsoTerminateChatbot, spannableStringBuilder), LocaleController.getString(R.string.Terminate), new SessionsActivity$$ExternalSyntheticLambda2(this, c2 == true ? 1 : 0), this.resourceProvider, false);
            return;
        }
        if (i >= this.botSessionsStartRow && i < this.botSessionsEndRow) {
            if (getParentActivity() == null || (arrayList = this.bots) == null || arrayList.isEmpty()) {
                return;
            }
            int i8 = i - this.botSessionsStartRow;
            new ChatbotSheet(getParentActivity(), (TL_account.TL_connectedBot) this.bots.get(i8), new OAuthSheet$$ExternalSyntheticLambda17(this, i8, 24), this.resourceProvider).show();
            return;
        }
        if (((i < this.otherSessionsStartRow || i >= this.otherSessionsEndRow) && ((i < this.passwordSessionsStartRow || i >= this.passwordSessionsEndRow) && i != this.currentSessionRow)) || getParentActivity() == null) {
            return;
        }
        ArrayList arrayList4 = this.sessions;
        if (i6 == 0) {
            if (i == this.currentSessionRow) {
                tL_authorization = this.currentSession;
            } else {
                int i9 = this.otherSessionsStartRow;
                tL_authorization = (i < i9 || i >= this.otherSessionsEndRow) ? (TLRPC.TL_authorization) this.passwordSessions.get(i - this.passwordSessionsStartRow) : (TLRPC.TL_authorization) arrayList4.get(i - i9);
                z = false;
            }
            if (tL_authorization == null) {
                return;
            }
            new SessionBottomSheet(this, tL_authorization, z, new AnonymousClass5()).show();
            return;
        }
        AlertDialog.Builder builder3 = new AlertDialog.Builder(getParentActivity(), 0, null);
        boolean[] zArr = new boolean[1];
        AlertDialog alertDialog3 = builder3.alertDialog;
        if (i6 == 0) {
            alertDialog3.message = LocaleController.getString(R.string.TerminateSessionText);
            alertDialog3.title = LocaleController.getString(R.string.AreYouSureSessionTitle);
            string = LocaleController.getString(R.string.Terminate);
        } else {
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) arrayList4.get(i - this.otherSessionsStartRow);
            alertDialog3.message = LocaleController.formatString("TerminateWebSessionText", R.string.TerminateWebSessionText, tL_webAuthorization.domain);
            alertDialog3.title = LocaleController.getString(R.string.TerminateWebSessionTitle);
            CharSequence string4 = LocaleController.getString(R.string.Disconnect);
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_webAuthorization.bot_id));
            String firstName = user2 != null ? UserObject.getFirstName(user2) : "";
            CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 1);
            checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            checkBoxCell.setText(LocaleController.formatString("TerminateWebSessionStop", R.string.TerminateWebSessionStop, firstName), "", false, false, false);
            checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            checkBoxCell.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda342(13, zArr));
            alertDialog3.customViewOffset = 16;
            builder3.setView(frameLayout);
            string = string4;
        }
        builder3.setPositiveButton(string, new PassportActivity$$ExternalSyntheticLambda52(this, i, zArr, 15));
        builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog3);
        TextView textView2 = (TextView) alertDialog3.getButton(-1);
        if (textView2 != null) {
            textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public final void lambda$createView$3$6$2() {
        BusinessChatbotController businessChatbotController = BusinessChatbotController.getInstance(this.currentAccount);
        businessChatbotController.loaded = false;
        businessChatbotController.load(null);
    }

    public final void lambda$createView$7(Boolean bool) {
        ArrayList arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = this.bots) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = MessagesController.getInstance(this.currentAccount).getInputUser(((TL_account.TL_connectedBot) this.bots.get(0)).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateconnectedbot, new SessionsActivity$$ExternalSyntheticLambda13(this, 0));
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new SessionsActivity$$ExternalSyntheticLambda13(this, 1));
    }

    public final void lambda$loadSessions$25(TLObject tLObject, TLRPC.TL_error tL_error, boolean z) {
        this.loading = false;
        if (tL_error == null) {
            ArrayList arrayList = this.sessions;
            arrayList.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(webauthorizations.users, false);
            arrayList.addAll(webauthorizations.authorizations);
            updateRows$17();
        }
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
        PrivacySettingsActivity$$ExternalSyntheticLambda3 privacySettingsActivity$$ExternalSyntheticLambda3 = this.delegate;
        if (privacySettingsActivity$$ExternalSyntheticLambda3 != null) {
            privacySettingsActivity$$ExternalSyntheticLambda3.sessionsLoaded();
        }
        int i = this.repeatLoad;
        if (i > 0) {
            int i2 = i - 1;
            this.repeatLoad = i2;
            if (i2 > 0) {
                AndroidUtilities.runOnUIThread(new SessionsActivity$$ExternalSyntheticLambda17(this, z, 0), 2500L);
            }
        }
    }

    public final void loadSessions(final boolean z) {
        if (this.loading) {
            return;
        }
        if (!z) {
            this.loading = true;
        }
        if (this.currentType == 0) {
            final int i = 0;
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) {
                public final SessionsActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i) {
                        case 0:
                            final SessionsActivity sessionsActivity = this.f$0;
                            sessionsActivity.getClass();
                            final boolean z2 = z;
                            final int i2 = 0;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i2) {
                                        case 0:
                                            SessionsActivity sessionsActivity2 = sessionsActivity;
                                            sessionsActivity2.loading = false;
                                            if (tL_error == null) {
                                                ArrayList arrayList = sessionsActivity2.sessions;
                                                arrayList.clear();
                                                ArrayList arrayList2 = sessionsActivity2.passwordSessions;
                                                arrayList2.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i3 = 0; i3 < size; i3++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i3);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity2.currentSession = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList2.add(tL_authorization);
                                                    } else {
                                                        arrayList.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity2.ttlDays = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity2.updateRows$17();
                                                PrivacySettingsActivity$$ExternalSyntheticLambda3 privacySettingsActivity$$ExternalSyntheticLambda3 = sessionsActivity2.delegate;
                                                if (privacySettingsActivity$$ExternalSyntheticLambda3 != null) {
                                                    privacySettingsActivity$$ExternalSyntheticLambda3.sessionsLoaded();
                                                }
                                            }
                                            SessionsActivity.ListAdapter listAdapter = sessionsActivity2.listAdapter;
                                            if (listAdapter != null) {
                                                listAdapter.mObservable.notifyChanged();
                                            }
                                            PrivacySettingsActivity$$ExternalSyntheticLambda3 privacySettingsActivity$$ExternalSyntheticLambda4 = sessionsActivity2.delegate;
                                            if (privacySettingsActivity$$ExternalSyntheticLambda4 != null) {
                                                privacySettingsActivity$$ExternalSyntheticLambda4.sessionsLoaded();
                                            }
                                            int i4 = sessionsActivity2.repeatLoad;
                                            if (i4 > 0) {
                                                int i5 = i4 - 1;
                                                sessionsActivity2.repeatLoad = i5;
                                                if (i5 > 0) {
                                                    AndroidUtilities.runOnUIThread(new SessionsActivity$$ExternalSyntheticLambda17(sessionsActivity2, z2, 1), 2500L);
                                                }
                                            }
                                            break;
                                        default:
                                            sessionsActivity.lambda$loadSessions$25(tLObject, tL_error, z2);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final SessionsActivity sessionsActivity2 = this.f$0;
                            sessionsActivity2.getClass();
                            final boolean z3 = z;
                            final int i3 = 1;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i3) {
                                        case 0:
                                            SessionsActivity sessionsActivity3 = sessionsActivity2;
                                            sessionsActivity3.loading = false;
                                            if (tL_error == null) {
                                                ArrayList arrayList = sessionsActivity3.sessions;
                                                arrayList.clear();
                                                ArrayList arrayList2 = sessionsActivity3.passwordSessions;
                                                arrayList2.clear();
                                                TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                                int size = authorizationsVar.authorizations.size();
                                                for (int i4 = 0; i4 < size; i4++) {
                                                    TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i4);
                                                    if ((tL_authorization.flags & 1) != 0) {
                                                        sessionsActivity3.currentSession = tL_authorization;
                                                    } else if (tL_authorization.password_pending) {
                                                        arrayList2.add(tL_authorization);
                                                    } else {
                                                        arrayList.add(tL_authorization);
                                                    }
                                                }
                                                sessionsActivity3.ttlDays = authorizationsVar.authorization_ttl_days;
                                                sessionsActivity3.updateRows$17();
                                                PrivacySettingsActivity$$ExternalSyntheticLambda3 privacySettingsActivity$$ExternalSyntheticLambda3 = sessionsActivity3.delegate;
                                                if (privacySettingsActivity$$ExternalSyntheticLambda3 != null) {
                                                    privacySettingsActivity$$ExternalSyntheticLambda3.sessionsLoaded();
                                                }
                                            }
                                            SessionsActivity.ListAdapter listAdapter = sessionsActivity3.listAdapter;
                                            if (listAdapter != null) {
                                                listAdapter.mObservable.notifyChanged();
                                            }
                                            PrivacySettingsActivity$$ExternalSyntheticLambda3 privacySettingsActivity$$ExternalSyntheticLambda4 = sessionsActivity3.delegate;
                                            if (privacySettingsActivity$$ExternalSyntheticLambda4 != null) {
                                                privacySettingsActivity$$ExternalSyntheticLambda4.sessionsLoaded();
                                            }
                                            int i5 = sessionsActivity3.repeatLoad;
                                            if (i5 > 0) {
                                                int i6 = i5 - 1;
                                                sessionsActivity3.repeatLoad = i6;
                                                if (i6 > 0) {
                                                    AndroidUtilities.runOnUIThread(new SessionsActivity$$ExternalSyntheticLambda17(sessionsActivity3, z3, 1), 2500L);
                                                }
                                            }
                                            break;
                                        default:
                                            sessionsActivity2.lambda$loadSessions$25(tLObject, tL_error, z3);
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            }), this.classGuid);
            return;
        }
        final int i2 = 1;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getWebAuthorizations(), new RequestDelegate(this) {
            public final SessionsActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (i2) {
                    case 0:
                        final SessionsActivity sessionsActivity = this.f$0;
                        sessionsActivity.getClass();
                        final boolean z2 = z;
                        final int i3 = 0;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        SessionsActivity sessionsActivity3 = sessionsActivity;
                                        sessionsActivity3.loading = false;
                                        if (tL_error == null) {
                                            ArrayList arrayList = sessionsActivity3.sessions;
                                            arrayList.clear();
                                            ArrayList arrayList2 = sessionsActivity3.passwordSessions;
                                            arrayList2.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i4 = 0; i4 < size; i4++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i4);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity3.currentSession = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList2.add(tL_authorization);
                                                } else {
                                                    arrayList.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity3.ttlDays = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity3.updateRows$17();
                                            PrivacySettingsActivity$$ExternalSyntheticLambda3 privacySettingsActivity$$ExternalSyntheticLambda3 = sessionsActivity3.delegate;
                                            if (privacySettingsActivity$$ExternalSyntheticLambda3 != null) {
                                                privacySettingsActivity$$ExternalSyntheticLambda3.sessionsLoaded();
                                            }
                                        }
                                        SessionsActivity.ListAdapter listAdapter = sessionsActivity3.listAdapter;
                                        if (listAdapter != null) {
                                            listAdapter.mObservable.notifyChanged();
                                        }
                                        PrivacySettingsActivity$$ExternalSyntheticLambda3 privacySettingsActivity$$ExternalSyntheticLambda4 = sessionsActivity3.delegate;
                                        if (privacySettingsActivity$$ExternalSyntheticLambda4 != null) {
                                            privacySettingsActivity$$ExternalSyntheticLambda4.sessionsLoaded();
                                        }
                                        int i5 = sessionsActivity3.repeatLoad;
                                        if (i5 > 0) {
                                            int i6 = i5 - 1;
                                            sessionsActivity3.repeatLoad = i6;
                                            if (i6 > 0) {
                                                AndroidUtilities.runOnUIThread(new SessionsActivity$$ExternalSyntheticLambda17(sessionsActivity3, z2, 1), 2500L);
                                            }
                                        }
                                        break;
                                    default:
                                        sessionsActivity.lambda$loadSessions$25(tLObject, tL_error, z2);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final SessionsActivity sessionsActivity2 = this.f$0;
                        sessionsActivity2.getClass();
                        final boolean z3 = z;
                        final int i4 = 1;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i4) {
                                    case 0:
                                        SessionsActivity sessionsActivity3 = sessionsActivity2;
                                        sessionsActivity3.loading = false;
                                        if (tL_error == null) {
                                            ArrayList arrayList = sessionsActivity3.sessions;
                                            arrayList.clear();
                                            ArrayList arrayList2 = sessionsActivity3.passwordSessions;
                                            arrayList2.clear();
                                            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
                                            int size = authorizationsVar.authorizations.size();
                                            for (int i5 = 0; i5 < size; i5++) {
                                                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i5);
                                                if ((tL_authorization.flags & 1) != 0) {
                                                    sessionsActivity3.currentSession = tL_authorization;
                                                } else if (tL_authorization.password_pending) {
                                                    arrayList2.add(tL_authorization);
                                                } else {
                                                    arrayList.add(tL_authorization);
                                                }
                                            }
                                            sessionsActivity3.ttlDays = authorizationsVar.authorization_ttl_days;
                                            sessionsActivity3.updateRows$17();
                                            PrivacySettingsActivity$$ExternalSyntheticLambda3 privacySettingsActivity$$ExternalSyntheticLambda3 = sessionsActivity3.delegate;
                                            if (privacySettingsActivity$$ExternalSyntheticLambda3 != null) {
                                                privacySettingsActivity$$ExternalSyntheticLambda3.sessionsLoaded();
                                            }
                                        }
                                        SessionsActivity.ListAdapter listAdapter = sessionsActivity3.listAdapter;
                                        if (listAdapter != null) {
                                            listAdapter.mObservable.notifyChanged();
                                        }
                                        PrivacySettingsActivity$$ExternalSyntheticLambda3 privacySettingsActivity$$ExternalSyntheticLambda4 = sessionsActivity3.delegate;
                                        if (privacySettingsActivity$$ExternalSyntheticLambda4 != null) {
                                            privacySettingsActivity$$ExternalSyntheticLambda4.sessionsLoaded();
                                        }
                                        int i6 = sessionsActivity3.repeatLoad;
                                        if (i6 > 0) {
                                            int i7 = i6 - 1;
                                            sessionsActivity3.repeatLoad = i7;
                                            if (i7 > 0) {
                                                AndroidUtilities.runOnUIThread(new SessionsActivity$$ExternalSyntheticLambda17(sessionsActivity3, z3, 1), 2500L);
                                            }
                                        }
                                        break;
                                    default:
                                        sessionsActivity2.lambda$loadSessions$25(tLObject, tL_error, z3);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        }), this.classGuid);
    }

    @Override
    public final void onBecomeFullyHidden() {
        AnonymousClass4 anonymousClass4 = this.undoView;
        if (anonymousClass4 != null) {
            anonymousClass4.hide(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        updateRows$17();
        loadSessions(false);
        if (this.currentType == 0) {
            BusinessChatbotController.getInstance(this.currentAccount).load(new SessionsActivity$$ExternalSyntheticLambda2(this, 0));
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.newSessionReceived);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.newSessionReceived);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
        AnonymousClass4 anonymousClass4 = this.undoView;
        if (anonymousClass4 != null) {
            anonymousClass4.setTranslationY(-i4);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        AnonymousClass4 anonymousClass4 = this.undoView;
        if (anonymousClass4 != null) {
            anonymousClass4.hide(0, true);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i == 34) {
            if (iArr.length > 0 && iArr[0] == 0) {
                CameraScanActivity.showAsSheet(getParentActivity(), 2, new AnonymousClass6());
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.alertDialog.message = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            builder.setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new SessionsActivity$$ExternalSyntheticLambda4(this, 0));
            builder.setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            builder.setTopAnimation(R.raw.permission_request_camera, 72, Theme.getColor(null, Theme.key_dialogTopBackground, false), null);
            builder.show();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (!z || z2) {
            return;
        }
        this.fragmentOpened = true;
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof ScanQRCodeView) {
                ((ScanQRCodeView) childAt).buttonTextView.invalidate();
            }
        }
    }

    public final void setHighlightLinkDesktopDevice() {
        this.highlightLinkDesktopDevice = true;
    }

    public final void updateRows$17() {
        this.rowCount = 0;
        this.currentSessionSectionRow = -1;
        this.currentSessionRow = -1;
        this.terminateAllSessionsRow = -1;
        this.terminateAllSessionsDetailRow = -1;
        this.passwordSessionsSectionRow = -1;
        this.passwordSessionsStartRow = -1;
        this.passwordSessionsEndRow = -1;
        this.passwordSessionsDetailRow = -1;
        this.otherSessionsSectionRow = -1;
        this.otherSessionsStartRow = -1;
        this.otherSessionsEndRow = -1;
        this.botSessionsStartRow = -1;
        this.botSessionsEndRow = -1;
        this.otherSessionsTerminateDetail = -1;
        this.noOtherSessionsRow = -1;
        this.qrCodeRow = -1;
        this.qrCodeDividerRow = -1;
        this.ttlHeaderRow = -1;
        this.ttlRow = -1;
        this.ttlDivideRow = -1;
        int i = this.currentType;
        if (i == 0 && getMessagesController().qrLoginCamera) {
            int i2 = this.rowCount;
            this.qrCodeRow = i2;
            this.rowCount = i2 + 2;
            this.qrCodeDividerRow = i2 + 1;
        }
        if (this.loading) {
            if (i == 0) {
                int i3 = this.rowCount;
                this.currentSessionSectionRow = i3;
                this.rowCount = i3 + 2;
                this.currentSessionRow = i3 + 1;
                return;
            }
            return;
        }
        if (this.currentSession != null) {
            int i4 = this.rowCount;
            this.currentSessionSectionRow = i4;
            this.rowCount = i4 + 2;
            this.currentSessionRow = i4 + 1;
        }
        ArrayList arrayList = this.passwordSessions;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.sessions;
        if (zIsEmpty && arrayList2.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.terminateAllSessionsDetailRow = -1;
            if (i == 1 || this.currentSession != null) {
                int i5 = this.rowCount;
                this.rowCount = i5 + 1;
                this.noOtherSessionsRow = i5;
            } else {
                this.noOtherSessionsRow = -1;
            }
        } else {
            int i6 = this.rowCount;
            this.terminateAllSessionsRow = i6;
            this.rowCount = i6 + 2;
            this.terminateAllSessionsDetailRow = i6 + 1;
            this.noOtherSessionsRow = -1;
        }
        if (!arrayList.isEmpty()) {
            int i7 = this.rowCount;
            int i8 = i7 + 1;
            this.rowCount = i8;
            this.passwordSessionsSectionRow = i7;
            this.passwordSessionsStartRow = i8;
            int size = arrayList.size() + i8;
            this.passwordSessionsEndRow = size;
            this.rowCount = size + 1;
            this.passwordSessionsDetailRow = size;
        }
        if (arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.bots;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i9 = this.rowCount;
                int i10 = i9 + 1;
                this.rowCount = i10;
                this.otherSessionsSectionRow = i9;
                this.botSessionsStartRow = i10;
                int size2 = this.bots.size() + i10;
                this.botSessionsEndRow = size2;
                this.rowCount = size2 + 1;
                this.otherSessionsTerminateDetail = size2;
            }
        } else {
            int i11 = this.rowCount;
            this.rowCount = i11 + 1;
            this.otherSessionsSectionRow = i11;
            ArrayList arrayList4 = this.bots;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                int i12 = this.rowCount;
                this.botSessionsStartRow = i12;
                int size3 = this.bots.size() + i12;
                this.rowCount = size3;
                this.botSessionsEndRow = size3;
            }
            int i13 = this.rowCount;
            this.otherSessionsStartRow = i13;
            this.otherSessionsEndRow = arrayList2.size() + i13;
            int size4 = arrayList2.size() + this.rowCount;
            this.rowCount = size4 + 1;
            this.otherSessionsTerminateDetail = size4;
        }
        if (this.ttlDays > 0) {
            int i14 = this.rowCount;
            this.ttlHeaderRow = i14;
            this.ttlRow = i14 + 1;
            this.rowCount = i14 + 3;
            this.ttlDivideRow = i14 + 2;
        }
    }
}
