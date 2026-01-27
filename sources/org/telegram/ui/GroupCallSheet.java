package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;

public abstract class GroupCallSheet {
    public static void show(Context context, int i, long j, String str, Browser.Progress progress) {
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = str;
        show(context, i, j, tL_inputGroupCallSlug, progress);
    }

    public static void show(final android.content.Context r12, final int r13, final long r14, final org.telegram.tgnet.TLRPC.InputGroupCall r16, final org.telegram.messenger.browser.Browser.Progress r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallSheet.show(android.content.Context, int, long, org.telegram.tgnet.TLRPC$InputGroupCall, org.telegram.messenger.browser.Browser$Progress):void");
    }

    public static void lambda$show$1(final AlertDialog alertDialog, final Browser.Progress progress, final int i, final Context context, final long j, final TLRPC.InputGroupCall inputGroupCall, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GroupCallSheet.lambda$show$0(alertDialog, progress, tLObject, i, context, j, inputGroupCall, tL_error);
            }
        });
    }

    public static void lambda$show$0(AlertDialog alertDialog, Browser.Progress progress, TLObject tLObject, int i, Context context, long j, TLRPC.InputGroupCall inputGroupCall, TLRPC.TL_error tL_error) {
        BaseFragment safeLastFragment;
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        LaunchActivity launchActivity;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (progress != null) {
            progress.end();
        }
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(i).putUsers(groupcall.users, false);
            MessagesController.getInstance(i).putChats(groupcall.chats, false);
            if (VoIPService.getSharedInstance() != null && (conferenceCall = VoIPService.getSharedInstance().conference) != null && (groupCall = conferenceCall.groupCall) != null && groupcall.call.id == groupCall.id && (launchActivity = LaunchActivity.instance) != null) {
                GroupCallActivity.create(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
                return;
            } else {
                show(context, i, j, inputGroupCall, groupcall.call, groupcall.participants);
                return;
            }
        }
        if (tL_error == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            if (tL_error == null || (safeLastFragment = LaunchActivity.getSafeLastFragment()) == null) {
                return;
            }
            BulletinFactory.of(safeLastFragment).showForError(tL_error);
            return;
        }
        BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment2 != null) {
            BulletinFactory.of(safeLastFragment2).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.LinkIsNoActive)).show();
        }
    }

    public static void lambda$show$2(int i, int i2) {
        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
    }

    public static void show(final Context context, final int i, final long j, final TLRPC.InputGroupCall inputGroupCall, TLRPC.GroupCall groupCall, ArrayList arrayList) {
        DarkThemeResourceProvider darkThemeResourceProvider = new DarkThemeResourceProvider();
        BottomSheet.Builder builder = new BottomSheet.Builder(context, false, darkThemeResourceProvider);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton, darkThemeResourceProvider)));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.filled_calls_users);
        frameLayout.addView(imageView, LayoutHelper.createFrame(56, 56, 17));
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(80, 80, 1, 2, 21, 2, 13));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView = TextHelper.makeLinkTextView(context, 20.0f, i2, true, darkThemeResourceProvider);
        linksTextViewMakeLinkTextView.setText(LocaleController.getString(R.string.GroupCallLinkTitle));
        linksTextViewMakeLinkTextView.setGravity(17);
        linearLayout.addView(linksTextViewMakeLinkTextView, LayoutHelper.createLinear(-1, -2, 1, 2, 0, 2, 4));
        List list = (List) Collection.EL.stream(arrayList).map(new Function() {
            public Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                return GroupCallSheet.lambda$show$3((TLRPC.GroupCallParticipant) obj);
            }

            public Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() {
            public Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override
            public final boolean test(Object obj) {
                return GroupCallSheet.lambda$show$4(i, j, (Long) obj);
            }
        }).collect(Collectors.toList());
        boolean zIsEmpty = list.isEmpty();
        LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView2 = TextHelper.makeLinkTextView(context, 14.0f, i2, false, darkThemeResourceProvider);
        linksTextViewMakeLinkTextView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallLinkText)));
        linksTextViewMakeLinkTextView2.setGravity(17);
        linksTextViewMakeLinkTextView2.setMaxWidth(HintView2.cutInFancyHalf(linksTextViewMakeLinkTextView2.getText(), linksTextViewMakeLinkTextView2.getPaint()));
        linearLayout.addView(linksTextViewMakeLinkTextView2, LayoutHelper.createLinear(-1, -2, 1, 2, 0, 2, 23));
        if (!zIsEmpty) {
            View view = new View(context);
            view.setBackgroundColor(-14012362);
            linearLayout.addView(view, LayoutHelper.createLinear(-1, 0.66f, 7, 0, 0, 0, 0));
            AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
            avatarsImageView.setCentered(true);
            avatarsImageView.setSize(AndroidUtilities.dp(38.0f));
            int iMin = Math.min(3, list.size());
            avatarsImageView.setCount(iMin);
            for (int i3 = 0; i3 < iMin; i3++) {
                avatarsImageView.setObject(i3, i, MessagesController.getInstance(i).getUser((Long) list.get(i3)));
            }
            avatarsImageView.commitTransition(false);
            linearLayout.addView(avatarsImageView, LayoutHelper.createLinear(-1, 58, 2.0f, 11.0f, 5.0f, 0.0f));
            LinkSpanDrawable.LinksTextView linksTextViewMakeLinkTextView3 = TextHelper.makeLinkTextView(context, 14.0f, Theme.key_windowBackgroundWhiteBlackText, false, darkThemeResourceProvider);
            linksTextViewMakeLinkTextView3.setGravity(17);
            if (list.size() == 1) {
                linksTextViewMakeLinkTextView3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2One, DialogObject.getShortName(i, ((Long) list.get(0)).longValue()))));
            } else if (list.size() == 2) {
                linksTextViewMakeLinkTextView3.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GroupCallLinkText2Two, DialogObject.getShortName(i, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i, ((Long) list.get(1)).longValue()))));
            } else {
                linksTextViewMakeLinkTextView3.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GroupCallLinkText2Many", arrayList.size() - 2, DialogObject.getShortName(i, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i, ((Long) list.get(1)).longValue()))));
            }
            linksTextViewMakeLinkTextView3.setMaxWidth(HintView2.cutInFancyHalf(linksTextViewMakeLinkTextView3.getText(), linksTextViewMakeLinkTextView3.getPaint()));
            linearLayout.addView(linksTextViewMakeLinkTextView3, LayoutHelper.createLinear(-1, -2, 1, 2, 0, 2, 25));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout2.setClipToPadding(false);
        linearLayout2.setOrientation(0);
        linearLayout2.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, darkThemeResourceProvider), 6, 6));
        final CheckBox2 checkBox2 = new CheckBox2(context, 24, darkThemeResourceProvider);
        checkBox2.setColor(Theme.key_radioBackgroundChecked, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
        checkBox2.setDrawUnchecked(true);
        checkBox2.setChecked(MessagesController.getGlobalMainSettings().getBoolean("callmiconstart", true), false);
        checkBox2.setDrawBackgroundAsArc(10);
        linearLayout2.addView(checkBox2, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, darkThemeResourceProvider));
        textView.setTextSize(1, 14.0f);
        textView.setText("Turn on the microphone");
        linearLayout2.addView(textView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-2, 38, 1, 0, 4, 0, 12));
        ScaleStateListAnimator.apply(linearLayout2, 0.025f, 1.5f);
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                GroupCallSheet.lambda$show$5(checkBox2, view2);
            }
        });
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, darkThemeResourceProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.GroupCallLinkJoin), false);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 2.0f, 0.0f, 2.0f, 0.0f));
        builder.setCustomView(linearLayout);
        final BottomSheet bottomSheetCreate = builder.create();
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                GroupCallSheet.lambda$show$6(bottomSheetCreate, context, checkBox2, i, inputGroupCall, view2);
            }
        });
        bottomSheetCreate.fixNavigationBar();
        bottomSheetCreate.show();
    }

    public static Long lambda$show$3(TLRPC.GroupCallParticipant groupCallParticipant) {
        return Long.valueOf(DialogObject.getPeerDialogId(groupCallParticipant.peer));
    }

    public static boolean lambda$show$4(int i, long j, Long l) {
        return (l.longValue() == UserConfig.getInstance(i).getClientUserId() || l.longValue() == j) ? false : true;
    }

    public static void lambda$show$5(CheckBox2 checkBox2, View view) {
        checkBox2.setChecked(!checkBox2.isChecked(), true);
        MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", checkBox2.isChecked()).apply();
    }

    public static void lambda$show$6(BottomSheet bottomSheet, Context context, CheckBox2 checkBox2, int i, TLRPC.InputGroupCall inputGroupCall, View view) {
        bottomSheet.lambda$new$0();
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        if (activityFindActivity == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", checkBox2.isChecked()).apply();
        VoIPHelper.joinConference(activityFindActivity, i, inputGroupCall, false, null);
    }
}
