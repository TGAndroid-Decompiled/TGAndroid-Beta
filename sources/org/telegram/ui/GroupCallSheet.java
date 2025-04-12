package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import j$.util.Collection;
import j$.util.function.Function;
import j$.util.function.Predicate;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
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
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;

public abstract class GroupCallSheet {
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
            if (VoIPService.getSharedInstance() == null || (conferenceCall = VoIPService.getSharedInstance().conference) == null || (groupCall = conferenceCall.groupCall) == null || groupcall.call.id != groupCall.id || (launchActivity = LaunchActivity.instance) == null) {
                show(context, i, j, inputGroupCall, groupcall.call, groupcall.participants);
                return;
            } else {
                GroupCallActivity.create(launchActivity, AccountInstance.getInstance(VoIPService.getSharedInstance().getAccount()), null, null, false, null);
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

    public static void lambda$show$1(final AlertDialog alertDialog, final Browser.Progress progress, final int i, final Context context, final long j, final TLRPC.InputGroupCall inputGroupCall, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                GroupCallSheet.lambda$show$0(AlertDialog.this, progress, tLObject, i, context, j, inputGroupCall, tL_error);
            }
        });
    }

    public static void lambda$show$2(int i, int i2) {
        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
    }

    public static Long lambda$show$3(TLRPC.GroupCallParticipant groupCallParticipant) {
        return Long.valueOf(DialogObject.getPeerDialogId(groupCallParticipant.peer));
    }

    public static boolean lambda$show$4(int i, long j, Long l) {
        return (l.longValue() == UserConfig.getInstance(i).getClientUserId() || l.longValue() == j) ? false : true;
    }

    public static void lambda$show$5(BottomSheet bottomSheet, Context context, int i, TLRPC.InputGroupCall inputGroupCall, View view) {
        bottomSheet.lambda$new$0();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity == null) {
            return;
        }
        VoIPHelper.joinConference(findActivity, i, inputGroupCall, false, null);
    }

    public static void show(Context context, int i, long j, String str, Browser.Progress progress) {
        TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
        tL_inputGroupCallSlug.slug = str;
        show(context, i, j, tL_inputGroupCallSlug, progress);
    }

    public static void show(final android.content.Context r12, final int r13, final long r14, final org.telegram.tgnet.TLRPC.InputGroupCall r16, final org.telegram.messenger.browser.Browser.Progress r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.GroupCallSheet.show(android.content.Context, int, long, org.telegram.tgnet.TLRPC$InputGroupCall, org.telegram.messenger.browser.Browser$Progress):void");
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
        LinkSpanDrawable.LinksTextView makeLinkTextView = TextHelper.makeLinkTextView(context, 20.0f, i2, true, darkThemeResourceProvider);
        makeLinkTextView.setText(LocaleController.getString(R.string.GroupCallLinkTitle));
        makeLinkTextView.setGravity(17);
        linearLayout.addView(makeLinkTextView, LayoutHelper.createLinear(-1, -2, 1, 2, 0, 2, 4));
        List list = (List) Collection.EL.stream(arrayList).map(new Function() {
            @Override
            public Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override
            public final Object apply(Object obj) {
                Long lambda$show$3;
                lambda$show$3 = GroupCallSheet.lambda$show$3((TLRPC.GroupCallParticipant) obj);
                return lambda$show$3;
            }

            @Override
            public Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        }).filter(new Predicate() {
            @Override
            public Predicate and(Predicate predicate) {
                return Predicate.CC.$default$and(this, predicate);
            }

            @Override
            public Predicate negate() {
                return Predicate.CC.$default$negate(this);
            }

            @Override
            public Predicate or(Predicate predicate) {
                return Predicate.CC.$default$or(this, predicate);
            }

            @Override
            public final boolean test(Object obj) {
                boolean lambda$show$4;
                lambda$show$4 = GroupCallSheet.lambda$show$4(i, j, (Long) obj);
                return lambda$show$4;
            }
        }).collect(Collectors.toList());
        boolean z = !list.isEmpty();
        LinkSpanDrawable.LinksTextView makeLinkTextView2 = TextHelper.makeLinkTextView(context, 14.0f, i2, false, darkThemeResourceProvider);
        makeLinkTextView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupCallLinkText)));
        makeLinkTextView2.setGravity(17);
        makeLinkTextView2.setMaxWidth(HintView2.cutInFancyHalf(makeLinkTextView2.getText(), makeLinkTextView2.getPaint()));
        linearLayout.addView(makeLinkTextView2, LayoutHelper.createLinear(-1, -2, 1, 2, 0, 2, 23));
        if (z) {
            View view = new View(context);
            view.setBackgroundColor(-14012362);
            linearLayout.addView(view, LayoutHelper.createLinear(-1, 0.66f, 7, 0, 0, 0, 0));
            AvatarsImageView avatarsImageView = new AvatarsImageView(context, false);
            avatarsImageView.setCentered(true);
            avatarsImageView.setSize(AndroidUtilities.dp(38.0f));
            int min = Math.min(3, list.size());
            avatarsImageView.setCount(min);
            for (int i3 = 0; i3 < min; i3++) {
                avatarsImageView.setObject(i3, i, MessagesController.getInstance(i).getUser((Long) list.get(i3)));
            }
            avatarsImageView.commitTransition(false);
            linearLayout.addView(avatarsImageView, LayoutHelper.createLinear(-1, 58, 2.0f, 11.0f, 5.0f, 0.0f));
            LinkSpanDrawable.LinksTextView makeLinkTextView3 = TextHelper.makeLinkTextView(context, 14.0f, Theme.key_windowBackgroundWhiteBlackText, false, darkThemeResourceProvider);
            makeLinkTextView3.setGravity(17);
            makeLinkTextView3.setText(AndroidUtilities.replaceTags(list.size() == 1 ? LocaleController.formatString(R.string.GroupCallLinkText2One, DialogObject.getShortName(i, ((Long) list.get(0)).longValue())) : list.size() == 2 ? LocaleController.formatString(R.string.GroupCallLinkText2Two, DialogObject.getShortName(i, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i, ((Long) list.get(1)).longValue())) : LocaleController.formatPluralStringComma("GroupCallLinkText2Many", arrayList.size() - 2, DialogObject.getShortName(i, ((Long) list.get(0)).longValue()), DialogObject.getShortName(i, ((Long) list.get(1)).longValue()))));
            makeLinkTextView3.setMaxWidth(HintView2.cutInFancyHalf(makeLinkTextView3.getText(), makeLinkTextView3.getPaint()));
            linearLayout.addView(makeLinkTextView3, LayoutHelper.createLinear(-1, -2, 1, 2, 0, 2, 25));
        }
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, darkThemeResourceProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.GroupCallLinkJoin), false);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 2.0f, 0.0f, 2.0f, 0.0f));
        builder.setCustomView(linearLayout);
        final BottomSheet create = builder.create();
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                GroupCallSheet.lambda$show$5(BottomSheet.this, context, i, inputGroupCall, view2);
            }
        });
        create.fixNavigationBar();
        create.show();
    }
}
