package org.telegram.messenger;
public final class z9 implements Runnable {
    public final int f21978a;
    public final MessagesController f21979b;
    public final long f21980c;

    public z9(MessagesController messagesController, long j10, int i10) {
        this.f21978a = i10;
        this.f21979b = messagesController;
        this.f21980c = j10;
    }

    @Override
    public final void run() {
        switch (this.f21978a) {
            case 0:
                this.f21979b.lambda$setDefaultBannedRole$96(this.f21980c);
                return;
            case 1:
                this.f21979b.lambda$getChannelDifference$345(this.f21980c);
                return;
            case 2:
                this.f21979b.lambda$deleteParticipantFromChat$316(this.f21980c);
                return;
            case 3:
                this.f21979b.lambda$getChannelDifference$346(this.f21980c);
                return;
            case 4:
                this.f21979b.lambda$setBoostsToUnblockRestrictions$94(this.f21980c);
                return;
            case 5:
                this.f21979b.lambda$deleteDialog$139(this.f21980c);
                return;
            case 6:
                this.f21979b.lambda$processUpdateArray$388(this.f21980c);
                return;
            case 7:
                this.f21979b.lambda$getSavedReactionTags$494(this.f21980c);
                return;
            case 8:
                this.f21979b.lambda$getChannelDifference$335(this.f21980c);
                return;
            case 9:
                this.f21979b.lambda$getChannelDifference$336(this.f21980c);
                return;
            case 10:
                this.f21979b.lambda$getChannelDifference$337(this.f21980c);
                return;
            case 11:
                this.f21979b.lambda$getChannelDifference$338(this.f21980c);
                return;
            case 12:
                this.f21979b.lambda$setChannelSlowMode$92(this.f21980c);
                return;
            case 13:
                this.f21979b.lambda$deleteDialog$138(this.f21980c);
                return;
            case 14:
                this.f21979b.lambda$setChatReactions$476(this.f21980c);
                return;
            case 15:
                this.f21979b.lambda$removeDialog$133(this.f21980c);
                return;
            case 16:
                this.f21979b.lambda$setParticipantBannedRole$89(this.f21980c);
                return;
            case 17:
                this.f21979b.lambda$addUserToChat$297(this.f21980c);
                return;
            case 18:
                this.f21979b.lambda$addUserToChat$307(this.f21980c);
                return;
            case 19:
                this.f21979b.lambda$addUserToChat$310(this.f21980c);
                return;
            case 20:
                this.f21979b.lambda$addUserToChat$306(this.f21980c);
                return;
            case 21:
                this.f21979b.lambda$getChannelDifference$344(this.f21980c);
                return;
            default:
                this.f21979b.lambda$deleteParticipantFromChat$313(this.f21980c);
                return;
        }
    }
}
